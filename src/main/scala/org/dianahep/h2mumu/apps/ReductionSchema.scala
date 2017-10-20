package org.dianahep.h2mumu.apps

case class Record4 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record3 (
    fCoordinates : Record4
)


case class Record6 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record5 (
    fCoordinates : Record6
)


case class Record2 (
    vertex_ : Record3,
    p4Polar_ : Record5,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record8 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record7 (
    patMuons_slimmedMuons__RECO_obj_innerTrack__product_ : Record8
)


case class Record10 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record9 (
    patMuons_slimmedMuons__RECO_obj_outerTrack__product_ : Record10
)


case class Record12 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record11 (
    patMuons_slimmedMuons__RECO_obj_globalTrack__product_ : Record12
)


case class Record14 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record13 (
    product_ : Record14
)


case class Record17 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record16 (
    fCoordinates : Record17
)


case class Record19 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record18 (
    fCoordinates : Record19
)


case class Record20 (
    id_ : Int
)


case class Record21 (
    id_ : Int
)


case class Record15 (
    tower : Float,
    towerS9 : Float,
    em : Float,
    emS9 : Float,
    emS25 : Float,
    emMax : Float,
    had : Float,
    hadS9 : Float,
    hadMax : Float,
    ho : Float,
    hoS9 : Float,
    ecal_time : Float,
    ecal_timeError : Float,
    hcal_time : Float,
    hcal_timeError : Float,
    ecal_position : Record16,
    hcal_position : Record18,
    ecal_id : Record20,
    hcal_id : Record21
)


case class Record24 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record23 (
    fCoordinates : Record24
)


case class Record26 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record25 (
    fCoordinates : Record26
)


case class Record22 (
    updatedSta : Boolean,
    trkKink : Float,
    glbKink : Float,
    trkRelChi2 : Float,
    staRelChi2 : Float,
    chi2LocalPosition : Float,
    chi2LocalMomentum : Float,
    localDistance : Float,
    globalDeltaEtaPhi : Float,
    tightMatch : Boolean,
    glbTrackProbability : Float,
    tkKink_position : Record23,
    glbKink_position : Record25
)


case class Record30 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record29 (
    product_ : Record30,
    index_ : Int
)


case class Record32 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record31 (
    product_ : Record32,
    index_ : Int
)


case class Record34 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record33 (
    product_ : Record34,
    index_ : Int
)


case class Record36 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record35 (
    product_ : Record36,
    index_ : Int
)


case class Record28 (
    x : Float,
    y : Float,
    xErr : Float,
    yErr : Float,
    dXdZ : Float,
    dYdZ : Float,
    dXdZErr : Float,
    dYdZErr : Float,
    mask : Int,
    hasZed_ : Boolean,
    hasPhi_ : Boolean,
    t0 : Float,
    dtSegmentRef : Record29,
    cscSegmentRef : Record31,
    gemSegmentRef : Record33,
    me0SegmentRef : Record35
)


case class Record39 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record38 (
    product_ : Record39,
    index_ : Int
)


case class Record41 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record40 (
    product_ : Record41,
    index_ : Int
)


case class Record43 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record42 (
    product_ : Record43,
    index_ : Int
)


case class Record45 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record44 (
    product_ : Record45,
    index_ : Int
)


case class Record37 (
    x : Float,
    y : Float,
    xErr : Float,
    yErr : Float,
    dXdZ : Float,
    dYdZ : Float,
    dXdZErr : Float,
    dYdZErr : Float,
    mask : Int,
    hasZed_ : Boolean,
    hasPhi_ : Boolean,
    t0 : Float,
    dtSegmentRef : Record38,
    cscSegmentRef : Record40,
    gemSegmentRef : Record42,
    me0SegmentRef : Record44
)


case class Record48 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record47 (
    product_ : Record48,
    index_ : Int
)


case class Record50 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record49 (
    product_ : Record50,
    index_ : Int
)


case class Record52 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record51 (
    product_ : Record52,
    index_ : Int
)


case class Record54 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record53 (
    product_ : Record54,
    index_ : Int
)


case class Record46 (
    x : Float,
    y : Float,
    xErr : Float,
    yErr : Float,
    dXdZ : Float,
    dYdZ : Float,
    dXdZErr : Float,
    dYdZErr : Float,
    mask : Int,
    hasZed_ : Boolean,
    hasPhi_ : Boolean,
    t0 : Float,
    dtSegmentRef : Record47,
    cscSegmentRef : Record49,
    gemSegmentRef : Record51,
    me0SegmentRef : Record53
)


case class Record57 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record56 (
    product_ : Record57,
    index_ : Int
)


case class Record59 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record58 (
    product_ : Record59,
    index_ : Int
)


case class Record61 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record60 (
    product_ : Record61,
    index_ : Int
)


case class Record63 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record62 (
    product_ : Record63,
    index_ : Int
)


case class Record55 (
    x : Float,
    y : Float,
    xErr : Float,
    yErr : Float,
    dXdZ : Float,
    dYdZ : Float,
    dXdZErr : Float,
    dYdZErr : Float,
    mask : Int,
    hasZed_ : Boolean,
    hasPhi_ : Boolean,
    t0 : Float,
    dtSegmentRef : Record56,
    cscSegmentRef : Record58,
    gemSegmentRef : Record60,
    me0SegmentRef : Record62
)


case class Record64 (
    x : Float,
    mask : Int,
    bx : Int
)


case class Record65 (
    id_ : Int
)


case class Record27 (
    segmentMatches : Seq[Record28],
    gemMatches : Seq[Record37],
    me0Matches : Seq[Record46],
    truthMatches : Seq[Record55],
    rpcMatches : Seq[Record64],
    edgeX : Float,
    edgeY : Float,
    x : Float,
    y : Float,
    xErr : Float,
    yErr : Float,
    dXdZ : Float,
    dYdZ : Float,
    dXdZErr : Float,
    dYdZErr : Float,
    id : Record65
)


case class Record66 (
    nDof : Int,
    timeAtIpInOut : Float,
    timeAtIpInOutErr : Float,
    timeAtIpOutIn : Float,
    timeAtIpOutInErr : Float
)


case class Record67 (
    nDof : Int,
    timeAtIpInOut : Float,
    timeAtIpInOutErr : Float,
    timeAtIpOutIn : Float,
    timeAtIpOutInErr : Float
)


case class Record68 (
    sumPt : Float,
    emEt : Float,
    hadEt : Float,
    hoEt : Float,
    nTracks : Int,
    nJets : Int,
    trackerVetoPt : Float,
    emVetoEt : Float,
    hadVetoEt : Float,
    hoVetoEt : Float
)


case class Record69 (
    sumPt : Float,
    emEt : Float,
    hadEt : Float,
    hoEt : Float,
    nTracks : Int,
    nJets : Int,
    trackerVetoPt : Float,
    emVetoEt : Float,
    hadVetoEt : Float,
    hoVetoEt : Float
)


case class Record70 (
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record71 (
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record72 (
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record73 (
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record74 (
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record75 (
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record77 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record76 (
    fCoordinates : Record77
)


case class Record79 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record78 (
    patMuons_slimmedMuons__RECO_obj_refToOrig__core_ : Record79,
    key_ : Long
)


case class Record82 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record81 (
    core_ : Record82,
    indicies_ : Seq[Long]
)


case class Record80 (
    edm__PtrVectorBase : Record81
)


case class Record84 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record83 (
    core_ : Record84,
    key_ : Long
)


case class Record85 (
    first : Int,
    second : Int
)


case class Record86 (
    chiso_ : Float,
    nhiso_ : Float,
    phiso_ : Float,
    puiso_ : Float
)


case class Record89 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record91 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record90 (
    fCoordinates : Record91
)


case class Record93 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record92 (
    fCoordinates : Record93
)


case class Record88 (
    hitPattern_ : Record89,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record90,
    momentum_ : Record92,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record95 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record94 (
    product_ : Record95
)


case class Record87 (
    reco__TrackBase : Record88,
    extra_ : Record94
)


case class Record98 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record100 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record99 (
    fCoordinates : Record100
)


case class Record102 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record101 (
    fCoordinates : Record102
)


case class Record97 (
    hitPattern_ : Record98,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record99,
    momentum_ : Record101,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record104 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record103 (
    product_ : Record104
)


case class Record96 (
    reco__TrackBase : Record97,
    extra_ : Record103
)


case class Record107 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record109 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record108 (
    fCoordinates : Record109
)


case class Record111 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record110 (
    fCoordinates : Record111
)


case class Record106 (
    hitPattern_ : Record107,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record108,
    momentum_ : Record110,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record113 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record112 (
    product_ : Record113
)


case class Record105 (
    reco__TrackBase : Record106,
    extra_ : Record112
)


case class Record116 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record118 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record117 (
    fCoordinates : Record118
)


case class Record120 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record119 (
    fCoordinates : Record120
)


case class Record115 (
    hitPattern_ : Record116,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record117,
    momentum_ : Record119,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record122 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record121 (
    product_ : Record122
)


case class Record114 (
    reco__TrackBase : Record115,
    extra_ : Record121
)


case class Record125 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record127 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record126 (
    fCoordinates : Record127
)


case class Record129 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record128 (
    fCoordinates : Record129
)


case class Record124 (
    hitPattern_ : Record125,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record126,
    momentum_ : Record128,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record131 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record130 (
    product_ : Record131
)


case class Record123 (
    reco__TrackBase : Record124,
    extra_ : Record130
)


case class Record132 (
    type_ : Int,
    corrX_ : Float,
    corrY_ : Float
)


case class Record133 (
    type_ : Int,
    corrX_ : Float,
    corrY_ : Float
)


case class Record136 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record138 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record137 (
    fCoordinates : Record138
)


case class Record140 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record139 (
    fCoordinates : Record140
)


case class Record135 (
    hitPattern_ : Record136,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record137,
    momentum_ : Record139,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record142 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record141 (
    product_ : Record142
)


case class Record134 (
    reco__TrackBase : Record135,
    extra_ : Record141
)


case class Record145 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record147 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record146 (
    fCoordinates : Record147
)


case class Record149 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record148 (
    fCoordinates : Record149
)


case class Record144 (
    hitPattern_ : Record145,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record146,
    momentum_ : Record148,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record151 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record150 (
    product_ : Record151
)


case class Record143 (
    reco__TrackBase : Record144,
    extra_ : Record150
)


case class Record154 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record156 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record155 (
    fCoordinates : Record156
)


case class Record158 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record157 (
    fCoordinates : Record158
)


case class Record153 (
    hitPattern_ : Record154,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record155,
    momentum_ : Record157,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record160 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record159 (
    product_ : Record160
)


case class Record152 (
    reco__TrackBase : Record153,
    extra_ : Record159
)


case class Record162 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record161 (
    patMuons_slimmedMuons__RECO_obj_pfCandidateRef__product_ : Record162
)


case class Record1 (
    m_state : Record2,
    innerTrack_ : Record7,
    outerTrack_ : Record9,
    globalTrack_ : Record11,
    patMuons_slimmedMuons__RECO_obj_refittedTrackMap_ : Map[Int, Record13],
    bestTrackType_ : Int,
    bestTunePTrackType_ : Int,
    calEnergy_ : Record15,
    combinedQuality_ : Record22,
    patMuons_slimmedMuons__RECO_obj_muMatches_ : Seq[Record27],
    time_ : Record66,
    rpcTime_ : Record67,
    energyValid_ : Boolean,
    matchesValid_ : Boolean,
    isolationValid_ : Boolean,
    pfIsolationValid_ : Boolean,
    qualityValid_ : Boolean,
    caloCompatibility_ : Float,
    isolationR03_ : Record68,
    isolationR05_ : Record69,
    pfIsolationR03_ : Record70,
    pfIsoMeanDRR03_ : Record71,
    pfIsoSumDRR03_ : Record72,
    pfIsolationR04_ : Record73,
    pfIsoMeanDRR04_ : Record74,
    pfIsoSumDRR04_ : Record75,
    type_ : Int,
    pfP4_ : Record76,
    refToOrig_ : Record78,
    patMuons_slimmedMuons__RECO_obj_efficiencyNames_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_overlapLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_overlapItems_ : Seq[Record80],
    patMuons_slimmedMuons__RECO_obj_userDataLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userFloatLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userFloats_ : Seq[Float],
    patMuons_slimmedMuons__RECO_obj_userIntLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userInts_ : Seq[Int],
    patMuons_slimmedMuons__RECO_obj_userCandLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userCands_ : Seq[Record83],
    patMuons_slimmedMuons__RECO_obj_kinResolutionLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_isoDeposits_ : Seq[Record85],
    patMuons_slimmedMuons__RECO_obj_isolations_ : Seq[Float],
    miniPFIsolation_ : Record86,
    embeddedMuonBestTrack_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_muonBestTrack_ : Seq[Record87],
    embeddedTunePMuonBestTrack_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_tunePMuonBestTrack_ : Seq[Record96],
    embeddedTrack_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_track_ : Seq[Record105],
    embeddedStandAloneMuon_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_standAloneMuon_ : Seq[Record114],
    embeddedCombinedMuon_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_combinedMuon_ : Seq[Record123],
    embeddedTCMETMuonCorrs_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_tcMETMuonCorrs_ : Seq[Record132],
    embeddedCaloMETMuonCorrs_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_caloMETMuonCorrs_ : Seq[Record133],
    embeddedPickyMuon_ : Boolean,
    embeddedTpfmsMuon_ : Boolean,
    embeddedDytMuon_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_pickyMuon_ : Seq[Record134],
    patMuons_slimmedMuons__RECO_obj_tpfmsMuon_ : Seq[Record143],
    patMuons_slimmedMuons__RECO_obj_dytMuon_ : Seq[Record152],
    embeddedPFCandidate_ : Boolean,
    pfCandidateRef_ : Record161,
    cachedNormChi2_ : Boolean,
    normChi2_ : Double,
    cachedNumberOfValidHits_ : Boolean,
    numberOfValidHits_ : Int,
    cachedIP_ : Byte,
    ip_ : Seq[Float],
    eip_ : Seq[Float],
    puppiChargedHadronIso_ : Float,
    puppiNeutralHadronIso_ : Float,
    puppiPhotonIso_ : Float,
    puppiNoLeptonsChargedHadronIso_ : Float,
    puppiNoLeptonsNeutralHadronIso_ : Float,
    puppiNoLeptonsPhotonIso_ : Float,
    pfEcalEnergy_ : Float
)


case class Record0 (
    present : Boolean,
    patMuons_slimmedMuons__RECO_obj : Seq[Record1]
)


case class Record167 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record166 (
    fCoordinates : Record167
)


case class Record169 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record168 (
    fCoordinates : Record169
)


case class Record165 (
    vertex_ : Record166,
    p4Polar_ : Record168,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record170 (
    scPixCharge : Int,
    isGsfCtfScPixConsistent : Boolean,
    isGsfScPixConsistent : Boolean,
    isGsfCtfConsistent : Boolean
)


case class Record172 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record171 (
    patElectrons_slimmedElectrons__RECO_obj_core__product_ : Record172
)


case class Record175 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record174 (
    patElectrons_slimmedElectrons__RECO_obj_trackClusterMatching__electronCluster_core_ : Record175,
    key_ : Long
)


case class Record173 (
    electronCluster : Record174,
    eSuperClusterOverP : Float,
    eSeedClusterOverP : Float,
    eSeedClusterOverPout : Float,
    eEleClusterOverPout : Float,
    deltaEtaSuperClusterAtVtx : Float,
    deltaEtaSeedClusterAtCalo : Float,
    deltaEtaEleClusterAtCalo : Float,
    deltaPhiEleClusterAtCalo : Float,
    deltaPhiSuperClusterAtVtx : Float,
    deltaPhiSeedClusterAtCalo : Float
)


case class Record178 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record177 (
    fCoordinates : Record178
)


case class Record180 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record179 (
    fCoordinates : Record180
)


case class Record182 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record181 (
    fCoordinates : Record182
)


case class Record184 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record183 (
    fCoordinates : Record184
)


case class Record186 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record185 (
    fCoordinates : Record186
)


case class Record188 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record187 (
    fCoordinates : Record188
)


case class Record190 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record189 (
    fCoordinates : Record190
)


case class Record176 (
    positionAtVtx : Record177,
    positionAtCalo : Record179,
    momentumAtVtx : Record181,
    momentumAtCalo : Record183,
    momentumOut : Record185,
    momentumAtEleClus : Record187,
    momentumAtVtxWithConstraint : Record189
)


case class Record191 (
    isEB : Boolean,
    isEE : Boolean,
    isEBEEGap : Boolean,
    isEBEtaGap : Boolean,
    isEBPhiGap : Boolean,
    isEEDeeGap : Boolean,
    isEERingGap : Boolean
)


case class Record194 (
    id_ : Int
)


case class Record193 (
    DetId : Record194
)


case class Record192 (
    sigmaEtaEta : Float,
    sigmaIetaIeta : Float,
    sigmaIphiIphi : Float,
    e1x5 : Float,
    e2x5Max : Float,
    e5x5 : Float,
    r9 : Float,
    hcalDepth1OverEcal : Float,
    hcalDepth2OverEcal : Float,
    patElectrons_slimmedElectrons__RECO_obj_showerShape__hcalTowersBehindClusters : Seq[Record193],
    hcalDepth1OverEcalBc : Float,
    hcalDepth2OverEcalBc : Float,
    sigmaIetaIphi : Float,
    eMax : Float,
    e2nd : Float,
    eTop : Float,
    eLeft : Float,
    eRight : Float,
    eBottom : Float,
    e2x5Top : Float,
    e2x5Left : Float,
    e2x5Right : Float,
    e2x5Bottom : Float
)


case class Record197 (
    id_ : Int
)


case class Record196 (
    DetId : Record197
)


case class Record195 (
    sigmaEtaEta : Float,
    sigmaIetaIeta : Float,
    sigmaIphiIphi : Float,
    e1x5 : Float,
    e2x5Max : Float,
    e5x5 : Float,
    r9 : Float,
    hcalDepth1OverEcal : Float,
    hcalDepth2OverEcal : Float,
    patElectrons_slimmedElectrons__RECO_obj_full5x5_showerShape__hcalTowersBehindClusters : Seq[Record196],
    hcalDepth1OverEcalBc : Float,
    hcalDepth2OverEcalBc : Float,
    sigmaIetaIphi : Float,
    eMax : Float,
    e2nd : Float,
    eTop : Float,
    eLeft : Float,
    eRight : Float,
    eBottom : Float,
    e2x5Top : Float,
    e2x5Left : Float,
    e2x5Right : Float,
    e2x5Bottom : Float
)


case class Record198 (
    nSaturatedXtals : Int,
    isSeedSaturated : Boolean
)


case class Record199 (
    tkSumPt : Float,
    ecalRecHitSumEt : Float,
    hcalDepth1TowerSumEt : Float,
    hcalDepth2TowerSumEt : Float,
    hcalDepth1TowerSumEtBc : Float,
    hcalDepth2TowerSumEtBc : Float
)


case class Record200 (
    tkSumPt : Float,
    ecalRecHitSumEt : Float,
    hcalDepth1TowerSumEt : Float,
    hcalDepth2TowerSumEt : Float,
    hcalDepth1TowerSumEtBc : Float,
    hcalDepth2TowerSumEtBc : Float
)


case class Record201 (
    flags : Int,
    dist : Float,
    dcot : Float,
    radius : Float
)


case class Record202 (
    sumChargedHadronPt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record203 (
    earlyBrem : Int,
    lateBrem : Int,
    sigmaEtaEta : Float,
    hadEnergy : Float,
    deltaEta : Float,
    nClusterOutsideMustache : Int,
    etOutsideMustache : Float
)


case class Record204 (
    status : Int,
    mva_Isolated : Float,
    mva_e_pi : Float,
    mvaByPassForIsolated : Float
)


case class Record207 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record206 (
    patElectrons_slimmedElectrons__RECO_obj_ambiguousGsfTracks__refVector__product_ : Record207,
    patElectrons_slimmedElectrons__RECO_obj_ambiguousGsfTracks__refVector__keys_ : Seq[Int]
)


case class Record205 (
    refVector_ : Record206
)


case class Record208 (
    trackFbrem : Float,
    superClusterFbrem : Float
)


case class Record211 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record210 (
    fCoordinates : Record211
)


case class Record213 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record212 (
    fCoordinates : Record213
)


case class Record215 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record214 (
    fCoordinates : Record215
)


case class Record209 (
    isEcalEnergyCorrected : Boolean,
    correctedEcalEnergy : Float,
    correctedEcalEnergyError : Float,
    trackMomentumError : Float,
    fromSuperClusterP4 : Record210,
    fromSuperClusterP4Error : Float,
    combinedP4 : Record212,
    combinedP4Error : Float,
    pflowP4 : Record214,
    pflowP4Error : Float,
    candidateP4Kind : Int
)


case class Record216 (
    dPhi1 : Float,
    dPhi2 : Float,
    dRz1 : Float,
    dRz2 : Float,
    subdetectors : Byte
)


case class Record218 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record217 (
    patElectrons_slimmedElectrons__RECO_obj_refToOrig__core_ : Record218,
    key_ : Long
)


case class Record221 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record220 (
    core_ : Record221,
    indicies_ : Seq[Long]
)


case class Record219 (
    edm__PtrVectorBase : Record220
)


case class Record223 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record222 (
    core_ : Record223,
    key_ : Long
)


case class Record224 (
    first : Int,
    second : Int
)


case class Record225 (
    chiso_ : Float,
    nhiso_ : Float,
    phiso_ : Float,
    puiso_ : Float
)


case class Record228 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record227 (
    product_ : Record228
)


case class Record230 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record229 (
    product_ : Record230
)


case class Record232 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record231 (
    product_ : Record232
)


case class Record234 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record233 (
    product_ : Record234
)


case class Record237 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record236 (
    product_ : Record237,
    keys_ : Seq[Int]
)


case class Record235 (
    refVector_ : Record236
)


case class Record240 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record239 (
    product_ : Record240,
    keys_ : Seq[Int]
)


case class Record238 (
    refVector_ : Record239
)


case class Record226 (
    gsfTrack_ : Record227,
    superCluster_ : Record229,
    parentSuperCluster_ : Record231,
    closestCtfTrack_ : Record233,
    conversions_ : Record235,
    conversionsOneLeg_ : Record238,
    ctfGsfOverlap_ : Float,
    isEcalDrivenSeed_ : Boolean,
    isTrackerDrivenSeed_ : Boolean
)


case class Record244 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record246 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record245 (
    fCoordinates : Record246
)


case class Record248 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record247 (
    fCoordinates : Record248
)


case class Record243 (
    hitPattern_ : Record244,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record245,
    momentum_ : Record247,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record250 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record249 (
    product_ : Record250
)


case class Record242 (
    reco__TrackBase : Record243,
    extra_ : Record249
)


case class Record252 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record251 (
    product_ : Record252
)


case class Record254 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record253 (
    fCoordinates : Record254
)


case class Record241 (
    reco__Track : Record242,
    gsfExtra_ : Record251,
    chargeMode_ : Byte,
    momentumMode_ : Record253,
    covarianceMode_ : Seq[Float]
)


case class Record258 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record257 (
    fCoordinates : Record258
)


case class Record259 (
    detectors_ : Int
)


case class Record261 (
    id_ : Int
)


case class Record260 (
    first : Record261,
    second : Float
)


case class Record262 (
    id_ : Int
)


case class Record256 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record257,
    caloID_ : Record259,
    hitsAndFractions_ : Seq[Record260],
    algoID_ : Int,
    seedId_ : Record262,
    flags_ : Int
)


case class Record264 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record263 (
    core_ : Record264,
    key_ : Long
)


case class Record267 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record266 (
    core_ : Record267,
    indicies_ : Seq[Long]
)


case class Record265 (
    edm__PtrVectorBase : Record266
)


case class Record270 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record269 (
    core_ : Record270,
    indicies_ : Seq[Long]
)


case class Record268 (
    edm__PtrVectorBase : Record269
)


case class Record255 (
    reco__CaloCluster : Record256,
    seed_ : Record263,
    clusters_ : Record265,
    preshowerClusters_ : Record268,
    preshowerEnergy_ : Double,
    rawEnergy_ : Float,
    phiWidth_ : Float,
    etaWidth_ : Float,
    preshowerEnergy1_ : Double,
    preshowerEnergy2_ : Double
)


case class Record273 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record272 (
    fCoordinates : Record273
)


case class Record274 (
    detectors_ : Int
)


case class Record276 (
    id_ : Int
)


case class Record275 (
    first : Record276,
    second : Float
)


case class Record277 (
    id_ : Int
)


case class Record271 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record272,
    caloID_ : Record274,
    hitsAndFractions_ : Seq[Record275],
    algoID_ : Int,
    seedId_ : Record277,
    flags_ : Int
)


case class Record280 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record279 (
    fCoordinates : Record280
)


case class Record281 (
    detectors_ : Int
)


case class Record283 (
    id_ : Int
)


case class Record282 (
    first : Record283,
    second : Float
)


case class Record284 (
    id_ : Int
)


case class Record278 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record279,
    caloID_ : Record281,
    hitsAndFractions_ : Seq[Record282],
    algoID_ : Int,
    seedId_ : Record284,
    flags_ : Int
)


case class Record287 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record286 (
    fCoordinates : Record287
)


case class Record288 (
    detectors_ : Int
)


case class Record290 (
    id_ : Int
)


case class Record289 (
    first : Record290,
    second : Float
)


case class Record291 (
    id_ : Int
)


case class Record285 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record286,
    caloID_ : Record288,
    hitsAndFractions_ : Seq[Record289],
    algoID_ : Int,
    seedId_ : Record291,
    flags_ : Int
)


case class Record294 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record293 (
    fCoordinates : Record294
)


case class Record295 (
    detectors_ : Int
)


case class Record297 (
    id_ : Int
)


case class Record296 (
    first : Record297,
    second : Float
)


case class Record298 (
    id_ : Int
)


case class Record292 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record293,
    caloID_ : Record295,
    hitsAndFractions_ : Seq[Record296],
    algoID_ : Int,
    seedId_ : Record298,
    flags_ : Int
)


case class Record302 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record301 (
    fCoordinates : Record302
)


case class Record303 (
    detectors_ : Int
)


case class Record305 (
    id_ : Int
)


case class Record304 (
    first : Record305,
    second : Float
)


case class Record306 (
    id_ : Int
)


case class Record300 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record301,
    caloID_ : Record303,
    hitsAndFractions_ : Seq[Record304],
    algoID_ : Int,
    seedId_ : Record306,
    flags_ : Int
)


case class Record308 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record307 (
    core_ : Record308,
    key_ : Long
)


case class Record311 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record310 (
    core_ : Record311,
    indicies_ : Seq[Long]
)


case class Record309 (
    edm__PtrVectorBase : Record310
)


case class Record314 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record313 (
    core_ : Record314,
    indicies_ : Seq[Long]
)


case class Record312 (
    edm__PtrVectorBase : Record313
)


case class Record299 (
    reco__CaloCluster : Record300,
    seed_ : Record307,
    clusters_ : Record309,
    preshowerClusters_ : Record312,
    preshowerEnergy_ : Double,
    rawEnergy_ : Float,
    phiWidth_ : Float,
    etaWidth_ : Float,
    preshowerEnergy1_ : Double,
    preshowerEnergy2_ : Double
)


case class Record317 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record319 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record318 (
    fCoordinates : Record319
)


case class Record321 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record320 (
    fCoordinates : Record321
)


case class Record316 (
    hitPattern_ : Record317,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record318,
    momentum_ : Record320,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record323 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record322 (
    product_ : Record323
)


case class Record315 (
    reco__TrackBase : Record316,
    extra_ : Record322
)


case class Record326 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record325 (
    fCoordinates : Record326
)


case class Record327 (
    detectors_ : Int
)


case class Record329 (
    id_ : Int
)


case class Record328 (
    first : Record329,
    second : Float
)


case class Record330 (
    id_ : Int
)


case class Record324 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record325,
    caloID_ : Record327,
    hitsAndFractions_ : Seq[Record328],
    algoID_ : Int,
    seedId_ : Record330,
    flags_ : Int
)


case class Record333 (
    id_ : Int
)


case class Record332 (
    id_ : Record333,
    energy_ : Float,
    time_ : Float,
    flagBits_ : Int,
    extra_ : Int
)


case class Record331 (
    patElectrons_slimmedElectrons__RECO_obj_recHits__obj : Seq[Record332]
)


case class Record334 (
    first : String,
    second : Float
)


case class Record336 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record335 (
    patElectrons_slimmedElectrons__RECO_obj_pfCandidateRef__product_ : Record336
)


case class Record338 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record337 (
    fCoordinates : Record338
)


case class Record340 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record339 (
    patElectrons_slimmedElectrons__RECO_obj_packedPFCandidates__product_ : Record340
)


case class Record164 (
    m_state : Record165,
    chargeInfo_ : Record170,
    core_ : Record171,
    trackClusterMatching_ : Record173,
    trackExtrapolations_ : Record176,
    fiducialFlags_ : Record191,
    showerShape_ : Record192,
    full5x5_showerShape_ : Record195,
    saturationInfo_ : Record198,
    dr03_ : Record199,
    dr04_ : Record200,
    conversionRejection_ : Record201,
    pfIso_ : Record202,
    mvaInput_ : Record203,
    mvaOutput_ : Record204,
    passCutBasedPreselection_ : Boolean,
    passPflowPreselection_ : Boolean,
    passMvaPreslection_ : Boolean,
    ambiguous_ : Boolean,
    ambiguousGsfTracks_ : Record205,
    classVariables_ : Record208,
    class_ : Int,
    corrections_ : Record209,
    pixelMatchVariables_ : Record216,
    refToOrig_ : Record217,
    patElectrons_slimmedElectrons__RECO_obj_efficiencyNames_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_overlapLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_overlapItems_ : Seq[Record219],
    patElectrons_slimmedElectrons__RECO_obj_userDataLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userFloatLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userFloats_ : Seq[Float],
    patElectrons_slimmedElectrons__RECO_obj_userIntLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userInts_ : Seq[Int],
    patElectrons_slimmedElectrons__RECO_obj_userCandLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userCands_ : Seq[Record222],
    patElectrons_slimmedElectrons__RECO_obj_kinResolutionLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_isoDeposits_ : Seq[Record224],
    patElectrons_slimmedElectrons__RECO_obj_isolations_ : Seq[Float],
    miniPFIsolation_ : Record225,
    embeddedGsfElectronCore_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_gsfElectronCore_ : Seq[Record226],
    embeddedGsfTrack_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_gsfTrack_ : Seq[Record241],
    embeddedSuperCluster_ : Boolean,
    embeddedPflowSuperCluster_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_superCluster_ : Seq[Record255],
    patElectrons_slimmedElectrons__RECO_obj_basicClusters_ : Seq[Record271],
    patElectrons_slimmedElectrons__RECO_obj_preshowerClusters_ : Seq[Record278],
    patElectrons_slimmedElectrons__RECO_obj_pflowBasicClusters_ : Seq[Record285],
    patElectrons_slimmedElectrons__RECO_obj_pflowPreshowerClusters_ : Seq[Record292],
    patElectrons_slimmedElectrons__RECO_obj_pflowSuperCluster_ : Seq[Record299],
    embeddedTrack_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_track_ : Seq[Record315],
    embeddedSeedCluster_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_seedCluster_ : Seq[Record324],
    embeddedRecHits_ : Boolean,
    recHits_ : Record331,
    patElectrons_slimmedElectrons__RECO_obj_electronIDs_ : Seq[Record334],
    isPF_ : Boolean,
    embeddedPFCandidate_ : Boolean,
    pfCandidateRef_ : Record335,
    ecalDrivenMomentum_ : Record337,
    sigmaIetaIphi_ : Float,
    full5x5_sigmaIetaIphi_ : Float,
    ip3d_ : Double,
    ecalRegressionEnergy_ : Double,
    ecalTrackRegressionEnergy_ : Double,
    ecalRegressionError_ : Double,
    ecalTrackRegressionError_ : Double,
    ecalScale_ : Double,
    ecalSmear_ : Double,
    ecalRegressionScale_ : Double,
    ecalRegressionSmear_ : Double,
    ecalTrackRegressionScale_ : Double,
    ecalTrackRegressionSmear_ : Double,
    ecalPFClusIso_ : Float,
    hcalPFClusIso_ : Float,
    puppiChargedHadronIso_ : Float,
    puppiNeutralHadronIso_ : Float,
    puppiPhotonIso_ : Float,
    puppiNoLeptonsChargedHadronIso_ : Float,
    puppiNoLeptonsNeutralHadronIso_ : Float,
    puppiNoLeptonsPhotonIso_ : Float,
    passConversionVeto_ : Boolean,
    cachedIP_ : Byte,
    ip_ : Seq[Float],
    eip_ : Seq[Float],
    packedPFCandidates_ : Record339,
    patElectrons_slimmedElectrons__RECO_obj_associatedPackedFCandidateIndices_ : Seq[Short]
)


case class Record163 (
    present : Boolean,
    patElectrons_slimmedElectrons__RECO_obj : Seq[Record164]
)


case class Record345 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record344 (
    fCoordinates : Record345
)


case class Record347 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record346 (
    fCoordinates : Record347
)


case class Record343 (
    vertex_ : Record344,
    p4Polar_ : Record346,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record349 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record348 (
    fCoordinates : Record349
)


case class Record351 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record350 (
    patTaus_slimmedTaus__RECO_obj_leadTrack__product_ : Record351
)


case class Record354 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record353 (
    patTaus_slimmedTaus__RECO_obj_signalTracks__refVector__product_ : Record354,
    patTaus_slimmedTaus__RECO_obj_signalTracks__refVector__keys_ : Seq[Int]
)


case class Record352 (
    refVector_ : Record353
)


case class Record357 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record356 (
    patTaus_slimmedTaus__RECO_obj_isolationTracks__refVector__product_ : Record357,
    patTaus_slimmedTaus__RECO_obj_isolationTracks__refVector__keys_ : Seq[Int]
)


case class Record355 (
    refVector_ : Record356
)


case class Record359 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record358 (
    patTaus_slimmedTaus__RECO_obj_refToOrig__core_ : Record359,
    key_ : Long
)


case class Record362 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record361 (
    core_ : Record362,
    indicies_ : Seq[Long]
)


case class Record360 (
    edm__PtrVectorBase : Record361
)


case class Record364 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record363 (
    core_ : Record364,
    key_ : Long
)


case class Record365 (
    first : Int,
    second : Int
)


case class Record366 (
    chiso_ : Float,
    nhiso_ : Float,
    phiso_ : Float,
    puiso_ : Float
)


case class Record369 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record371 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record370 (
    fCoordinates : Record371
)


case class Record373 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record372 (
    fCoordinates : Record373
)


case class Record368 (
    hitPattern_ : Record369,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record370,
    momentum_ : Record372,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record375 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record374 (
    product_ : Record375
)


case class Record367 (
    reco__TrackBase : Record368,
    extra_ : Record374
)


case class Record378 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record380 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record379 (
    fCoordinates : Record380
)


case class Record382 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record381 (
    fCoordinates : Record382
)


case class Record377 (
    hitPattern_ : Record378,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record379,
    momentum_ : Record381,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record384 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record383 (
    product_ : Record384
)


case class Record376 (
    reco__TrackBase : Record377,
    extra_ : Record383
)


case class Record387 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record389 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record388 (
    fCoordinates : Record389
)


case class Record391 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record390 (
    fCoordinates : Record391
)


case class Record386 (
    hitPattern_ : Record387,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record388,
    momentum_ : Record390,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record393 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record392 (
    product_ : Record393
)


case class Record385 (
    reco__TrackBase : Record386,
    extra_ : Record392
)


case class Record394 (
    first : String,
    second : Float
)


case class Record396 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record395 (
    patTaus_slimmedTaus__RECO_obj_signalChargedHadrCandPtrs__core_ : Record396,
    patTaus_slimmedTaus__RECO_obj_signalChargedHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record398 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record397 (
    patTaus_slimmedTaus__RECO_obj_signalNeutralHadrCandPtrs__core_ : Record398,
    patTaus_slimmedTaus__RECO_obj_signalNeutralHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record400 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record399 (
    patTaus_slimmedTaus__RECO_obj_signalGammaCandPtrs__core_ : Record400,
    patTaus_slimmedTaus__RECO_obj_signalGammaCandPtrs__indicies_ : Seq[Long]
)


case class Record402 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record401 (
    patTaus_slimmedTaus__RECO_obj_isolationChargedHadrCandPtrs__core_ : Record402,
    patTaus_slimmedTaus__RECO_obj_isolationChargedHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record404 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record403 (
    patTaus_slimmedTaus__RECO_obj_isolationNeutralHadrCandPtrs__core_ : Record404,
    patTaus_slimmedTaus__RECO_obj_isolationNeutralHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record406 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record405 (
    patTaus_slimmedTaus__RECO_obj_isolationGammaCandPtrs__core_ : Record406,
    patTaus_slimmedTaus__RECO_obj_isolationGammaCandPtrs__indicies_ : Seq[Long]
)


case class Record409 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record408 (
    fCoordinates : Record409
)


case class Record411 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record410 (
    fCoordinates : Record411
)


case class Record413 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record412 (
    fCoordinates : Record413
)


case class Record415 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record414 (
    product_ : Record415
)


case class Record417 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record416 (
    fCoordinates : Record417
)


case class Record419 (
    fArray : Seq[Float]
)


case class Record418 (
    fRep : Record419
)


case class Record421 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record420 (
    fCoordinates : Record421
)


case class Record423 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record422 (
    product_ : Record423
)


case class Record425 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record424 (
    fCoordinates : Record425
)


case class Record427 (
    fArray : Seq[Float]
)


case class Record426 (
    fRep : Record427
)


case class Record407 (
    p4Jet_ : Record408,
    p4CorrJet_ : Record410,
    decayMode_ : Int,
    dxy_PCA_ : Record412,
    dxy_ : Float,
    dxy_error_ : Float,
    dxy_Sig_ : Float,
    pv_ : Record414,
    pvPos_ : Record416,
    pvCov_ : Record418,
    hasSV_ : Boolean,
    flightLength_ : Record420,
    flightLengthSig_ : Float,
    sv_ : Record422,
    svPos_ : Record424,
    svCov_ : Record426,
    ip3d_ : Float,
    ip3d_error_ : Float,
    ecalEnergy_ : Float,
    hcalEnergy_ : Float,
    leadingTrackNormChi2_ : Float,
    phiAtEcalEntrance_ : Float,
    etaAtEcalEntrance_ : Float,
    ecalEnergyLeadChargedHadrCand_ : Float,
    hcalEnergyLeadChargedHadrCand_ : Float,
    etaAtEcalEntranceLeadChargedCand_ : Float,
    ptLeadChargedCand_ : Float,
    emFraction_ : Float
)


case class Record342 (
    m_state : Record343,
    alternatLorentzVect_ : Record348,
    leadTrack_ : Record350,
    signalTracks_ : Record352,
    isolationTracks_ : Record355,
    refToOrig_ : Record358,
    patTaus_slimmedTaus__RECO_obj_efficiencyNames_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_overlapLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_overlapItems_ : Seq[Record360],
    patTaus_slimmedTaus__RECO_obj_userDataLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userFloatLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userFloats_ : Seq[Float],
    patTaus_slimmedTaus__RECO_obj_userIntLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userInts_ : Seq[Int],
    patTaus_slimmedTaus__RECO_obj_userCandLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userCands_ : Seq[Record363],
    patTaus_slimmedTaus__RECO_obj_kinResolutionLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_isoDeposits_ : Seq[Record365],
    patTaus_slimmedTaus__RECO_obj_isolations_ : Seq[Float],
    miniPFIsolation_ : Record366,
    embeddedIsolationTracks_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_isolationTracks_ : Seq[Record367],
    embeddedLeadTrack_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_leadTrack_ : Seq[Record376],
    embeddedSignalTracks_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_signalTracks_ : Seq[Record385],
    embeddedLeadPFCand_ : Boolean,
    embeddedLeadPFChargedHadrCand_ : Boolean,
    embeddedLeadPFNeutralCand_ : Boolean,
    embeddedSignalPFCands_ : Boolean,
    embeddedSignalPFChargedHadrCands_ : Boolean,
    embeddedSignalPFNeutralHadrCands_ : Boolean,
    embeddedSignalPFGammaCands_ : Boolean,
    embeddedIsolationPFCands_ : Boolean,
    embeddedIsolationPFChargedHadrCands_ : Boolean,
    embeddedIsolationPFNeutralHadrCands_ : Boolean,
    embeddedIsolationPFGammaCands_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_tauIDs_ : Seq[Record394],
    currentJECSet_ : Int,
    currentJECLevel_ : Int,
    signalChargedHadrCandPtrs_ : Record395,
    signalNeutralHadrCandPtrs_ : Record397,
    signalGammaCandPtrs_ : Record399,
    isolationChargedHadrCandPtrs_ : Record401,
    isolationNeutralHadrCandPtrs_ : Record403,
    isolationGammaCandPtrs_ : Record405,
    patTaus_slimmedTaus__RECO_obj_pfEssential_ : Seq[Record407]
)


case class Record341 (
    present : Boolean,
    patTaus_slimmedTaus__RECO_obj : Seq[Record342]
)


case class Record431 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record430 (
    fCoordinates : Record431
)


case class Record434 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record436 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record435 (
    fCoordinates : Record436
)


case class Record438 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record437 (
    fCoordinates : Record438
)


case class Record433 (
    hitPattern_ : Record434,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record435,
    momentum_ : Record437,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record440 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record439 (
    product_ : Record440
)


case class Record432 (
    reco__TrackBase : Record433,
    extra_ : Record439
)


case class Record429 (
    chi2_ : Float,
    ndof_ : Float,
    position_ : Record430,
    covariance_ : Seq[Float],
    recoVertexs_offlineSlimmedPrimaryVertices__RECO_obj_refittedTracks_ : Seq[Record432],
    recoVertexs_offlineSlimmedPrimaryVertices__RECO_obj_weights_ : Seq[Byte],
    validity_ : Boolean,
    time_ : Double
)


case class Record428 (
    present : Boolean,
    recoVertexs_offlineSlimmedPrimaryVertices__RECO_obj : Seq[Record429]
)


case class Record444 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record443 (
    fCoordinates : Record444
)


case class Record446 (
    fArray : Seq[Double]
)


case class Record445 (
    fRep : Record446
)


case class Record442 (
    position_ : Record443,
    error_ : Record445,
    sigmaZ_ : Float,
    BeamWidthX_ : Float,
    BeamWidthY_ : Float,
    dxdz_ : Float,
    dydz_ : Float,
    emittanceX_ : Float,
    emittanceY_ : Float,
    betaStar_ : Float,
    type_ : Int
)


case class Record441 (
    present : Boolean,
    recoBeamSpot_offlineBeamSpot__RECO_obj : Record442
)


case class Record450 (
    status_ : Short
)


case class Record449 (
    paths_ : Seq[Record450]
)


case class Record451 (
    hash_ : String
)


case class Record448 (
    edm__HLTGlobalStatus : Record449,
    psetid_ : Record451,
    names_ : Seq[String]
)


case class Record447 (
    present : Boolean,
    edmTriggerResults_TriggerResults__HLT_obj : Record448
)


case class Record456 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record455 (
    fCoordinates : Record456
)


case class Record458 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record457 (
    fCoordinates : Record458
)


case class Record454 (
    vertex_ : Record455,
    p4Polar_ : Record457,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record459 (
    hash_ : String
)


case class Record453 (
    m_state : Record454,
    collection_ : String,
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_triggerObjectTypes_ : Seq[Int],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_filterLabels_ : Seq[String],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_filterLabelIndices_ : Seq[Short],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathNames_ : Seq[String],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathIndices_ : Seq[Short],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathLastFilterAccepted_ : Seq[Boolean],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathL3FilterAccepted_ : Seq[Boolean],
    psetId_ : Record459
)


case class Record452 (
    present : Boolean,
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj : Seq[Record453]
)


case class Record464 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record463 (
    fCoordinates : Record464
)


case class Record466 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record465 (
    fCoordinates : Record466
)


case class Record462 (
    vertex_ : Record463,
    p4Polar_ : Record465,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record468 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record467 (
    patMETs_slimmedMETs__RECO_obj_refToOrig__core_ : Record468,
    key_ : Long
)


case class Record471 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record470 (
    core_ : Record471,
    indicies_ : Seq[Long]
)


case class Record469 (
    edm__PtrVectorBase : Record470
)


case class Record473 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record472 (
    core_ : Record473,
    key_ : Long
)


case class Record474 (
    NeutralEMFraction : Float,
    NeutralHadFraction : Float,
    ChargedEMFraction : Float,
    ChargedHadFraction : Float,
    MuonFraction : Float,
    Type6Fraction : Float,
    Type7Fraction : Float
)


case class Record475 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record476 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record477 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record478 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record479 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record480 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record461 (
    m_state : Record462,
    sumet : Double,
    elongit : Double,
    signif_dxx : Double,
    signif_dyy : Double,
    signif_dyx : Double,
    signif_dxy : Double,
    refToOrig_ : Record467,
    patMETs_slimmedMETs__RECO_obj_efficiencyNames_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_overlapLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_overlapItems_ : Seq[Record469],
    patMETs_slimmedMETs__RECO_obj_userDataLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userFloatLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userFloats_ : Seq[Float],
    patMETs_slimmedMETs__RECO_obj_userIntLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userInts_ : Seq[Int],
    patMETs_slimmedMETs__RECO_obj_userCandLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userCands_ : Seq[Record472],
    patMETs_slimmedMETs__RECO_obj_kinResolutionLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_pfMET_ : Seq[Record474],
    metSig_ : Double,
    patMETs_slimmedMETs__RECO_obj_uncertaintiesRaw_ : Seq[Record475],
    patMETs_slimmedMETs__RECO_obj_uncertaintiesType1_ : Seq[Record476],
    patMETs_slimmedMETs__RECO_obj_uncertaintiesType1p2_ : Seq[Record477],
    patMETs_slimmedMETs__RECO_obj_uncertainties_ : Seq[Record478],
    patMETs_slimmedMETs__RECO_obj_corrections_ : Seq[Record479],
    caloPackedMet_ : Record480
)


case class Record460 (
    present : Boolean,
    patMETs_slimmedMETs__RECO_obj : Seq[Record461]
)


case class Record485 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record484 (
    fCoordinates : Record485
)


case class Record487 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record486 (
    fCoordinates : Record487
)


case class Record483 (
    vertex_ : Record484,
    p4Polar_ : Record486,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record489 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record488 (
    core_ : Record489,
    key_ : Long
)


case class Record491 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record490 (
    patJets_slimmedJets__RECO_obj_refToOrig__core_ : Record491,
    key_ : Long
)


case class Record494 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record493 (
    core_ : Record494,
    indicies_ : Seq[Long]
)


case class Record492 (
    edm__PtrVectorBase : Record493
)


case class Record496 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record495 (
    core_ : Record496,
    key_ : Long
)


case class Record498 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record497 (
    core_ : Record498,
    key_ : Long
)


case class Record501 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record500 (
    patJets_slimmedJets__RECO_obj_genJetRef__refVector__product_ : Record501,
    patJets_slimmedJets__RECO_obj_genJetRef__refVector__keys_ : Seq[Int]
)


case class Record499 (
    refVector_ : Record500
)


case class Record504 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record503 (
    patJets_slimmedJets__RECO_obj_genJetFwdRef__ref__product_ : Record504
)


case class Record506 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record505 (
    patJets_slimmedJets__RECO_obj_genJetFwdRef__backRef__product_ : Record506
)


case class Record502 (
    ref_ : Record503,
    backRef_ : Record505
)


case class Record510 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record509 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_bHadrons_refVector__product_ : Record510,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_bHadrons_refVector__keys_ : Seq[Int]
)


case class Record508 (
    refVector_ : Record509
)


case class Record513 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record512 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_cHadrons_refVector__product_ : Record513,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_cHadrons_refVector__keys_ : Seq[Int]
)


case class Record511 (
    refVector_ : Record512
)


case class Record516 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record515 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_partons_refVector__product_ : Record516,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_partons_refVector__keys_ : Seq[Int]
)


case class Record514 (
    refVector_ : Record515
)


case class Record519 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record518 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_leptons_refVector__product_ : Record519,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_leptons_refVector__keys_ : Seq[Int]
)


case class Record517 (
    refVector_ : Record518
)


case class Record507 (
    m_bHadrons : Record508,
    m_cHadrons : Record511,
    m_partons : Record514,
    m_leptons : Record517,
    m_hadronFlavour : Int,
    m_partonFlavour : Int
)


case class Record521 (
    first : String,
    second : Seq[Float]
)


case class Record520 (
    label_ : String,
    jec_ : Seq[Record521]
)


case class Record522 (
    first : String,
    second : Float
)


case class Record525 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record524 (
    patJets_slimmedJets__RECO_obj_associatedTracks__refVector__product_ : Record525,
    patJets_slimmedJets__RECO_obj_associatedTracks__refVector__keys_ : Seq[Int]
)


case class Record523 (
    refVector_ : Record524
)


case class Record526 (
    mChargedHadronEnergy : Float,
    mNeutralHadronEnergy : Float,
    mPhotonEnergy : Float,
    mElectronEnergy : Float,
    mMuonEnergy : Float,
    mHFHadronEnergy : Float,
    mHFEMEnergy : Float,
    mChargedHadronMultiplicity : Int,
    mNeutralHadronMultiplicity : Int,
    mPhotonMultiplicity : Int,
    mElectronMultiplicity : Int,
    mMuonMultiplicity : Int,
    mHFHadronMultiplicity : Int,
    mHFEMMultiplicity : Int,
    mChargedEmEnergy : Float,
    mChargedMuEnergy : Float,
    mNeutralEmEnergy : Float,
    mChargedMultiplicity : Int,
    mNeutralMultiplicity : Int,
    mHOEnergy : Float
)


case class Record527 (
    fHPD : Float,
    fRBX : Float,
    n90Hits : Short,
    fSubDetector1 : Float,
    fSubDetector2 : Float,
    fSubDetector3 : Float,
    fSubDetector4 : Float,
    restrictedEMF : Float,
    nHCALTowers : Short,
    nECALTowers : Short,
    approximatefHPD : Float,
    approximatefRBX : Float,
    hitsInN90 : Short,
    numberOfHits2RPC : Short,
    numberOfHits3RPC : Short,
    numberOfHitsRPC : Short,
    fEB : Float,
    fEE : Float,
    fHB : Float,
    fHE : Float,
    fHO : Float,
    fLong : Float,
    fShort : Float,
    fLS : Float,
    fHFOOT : Float
)


case class Record482 (
    m_state : Record483,
    patJets_slimmedJets__RECO_obj_dau : Seq[Record488],
    mJetArea : Float,
    mPileupEnergy : Float,
    mPassNumber : Int,
    refToOrig_ : Record490,
    patJets_slimmedJets__RECO_obj_efficiencyNames_ : Seq[String],
    patJets_slimmedJets__RECO_obj_overlapLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_overlapItems_ : Seq[Record492],
    patJets_slimmedJets__RECO_obj_userDataLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userFloatLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userFloats_ : Seq[Float],
    patJets_slimmedJets__RECO_obj_userIntLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userInts_ : Seq[Int],
    patJets_slimmedJets__RECO_obj_userCandLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userCands_ : Seq[Record495],
    patJets_slimmedJets__RECO_obj_kinResolutionLabels_ : Seq[String],
    embeddedCaloTowers_ : Boolean,
    embeddedPFCandidates_ : Boolean,
    patJets_slimmedJets__RECO_obj_subjetCollections_ : Seq[Seq[Record497]],
    patJets_slimmedJets__RECO_obj_subjetLabels_ : Seq[String],
    genJetRef_ : Record499,
    genJetFwdRef_ : Record502,
    jetFlavourInfo_ : Record507,
    patJets_slimmedJets__RECO_obj_jec_ : Seq[Record520],
    currentJECSet_ : Int,
    currentJECLevel_ : Int,
    currentJECFlavor_ : Int,
    patJets_slimmedJets__RECO_obj_pairDiscriVector_ : Seq[Record522],
    patJets_slimmedJets__RECO_obj_tagInfoLabels_ : Seq[String],
    jetCharge_ : Float,
    associatedTracks_ : Record523,
    patJets_slimmedJets__RECO_obj_specificPF_ : Seq[Record526],
    jetID_ : Record527
)


case class Record481 (
    present : Boolean,
    patJets_slimmedJets__RECO_obj : Seq[Record482]
)


case class Event (
    patMuons_slimmedMuons__RECO_ : Record0,
    patElectrons_slimmedElectrons__RECO_ : Record163,
    patTaus_slimmedTaus__RECO_ : Record341,
    recoVertexs_offlineSlimmedPrimaryVertices__RECO_ : Record428,
    recoBeamSpot_offlineBeamSpot__RECO_ : Record441,
    edmTriggerResults_TriggerResults__HLT_ : Record447,
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_ : Record452,
    patMETs_slimmedMETs__RECO_ : Record460,
    patJets_slimmedJets__RECO_ : Record481
)

