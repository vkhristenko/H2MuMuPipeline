package org.dianahep

import org.apache.spark.sql.types._
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.Row

import scala.math._

import org.dianahep.h2mumu.apps.analysis._

package object h2mumu {
  implicit class HiggsDataset(ds: Dataset[Event]) {
    // select events with valid primary vertex
    def passVertex: Dataset[Event] = 
      ds.filter({e: Event => 
        e.cmsVertices
          .filter(_.validity_)
          .find({case v => abs(v.position_.fCoordinates.fZ)<24 && v.ndof_ > 4})
          .size==1
      })

    // select events with at least 2 muons: each with pt>10 and abs(eta) < 2.4
    def atLeast2Muons: Dataset[Event] = 
      ds.filter({e: Event =>
        e.cmsMuons
          .filter({case muon => muon.m_state.p4Polar_.fCoordinates.fPt > 10.0 && 
            muon.m_state.p4Polar_.fCoordinates.fEta < 2.4})
          .size>=2
      })
  }
}
