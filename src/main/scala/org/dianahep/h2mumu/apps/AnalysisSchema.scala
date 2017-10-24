package org.dianahep.h2mumu.apps.analysis

case class Record3 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record2 (
    fCoordinates : Record3
)


case class Record5 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record4 (
    fCoordinates : Record5
)


case class Record1 (
    vertex_ : Record2,
    p4Polar_ : Record4,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record7 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record6 (
    patMuons_slimmedMuons__RECO_obj_innerTrack__product_ : Record7
)


case class Record9 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record8 (
    patMuons_slimmedMuons__RECO_obj_outerTrack__product_ : Record9
)


case class Record11 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record10 (
    patMuons_slimmedMuons__RECO_obj_globalTrack__product_ : Record11
)


case class Record13 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record12 (
    product_ : Record13
)


case class Record16 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record15 (
    fCoordinates : Record16
)


case class Record18 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record17 (
    fCoordinates : Record18
)


case class Record19 (
    id_ : Int
)


case class Record20 (
    id_ : Int
)


case class Record14 (
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
    ecal_position : Record15,
    hcal_position : Record17,
    ecal_id : Record19,
    hcal_id : Record20
)


case class Record23 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record22 (
    fCoordinates : Record23
)


case class Record25 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record24 (
    fCoordinates : Record25
)


case class Record21 (
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
    tkKink_position : Record22,
    glbKink_position : Record24
)


case class Record29 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record28 (
    product_ : Record29,
    index_ : Int
)


case class Record31 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record30 (
    product_ : Record31,
    index_ : Int
)


case class Record33 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record32 (
    product_ : Record33,
    index_ : Int
)


case class Record35 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record34 (
    product_ : Record35,
    index_ : Int
)


case class Record27 (
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
    dtSegmentRef : Record28,
    cscSegmentRef : Record30,
    gemSegmentRef : Record32,
    me0SegmentRef : Record34
)


case class Record38 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record37 (
    product_ : Record38,
    index_ : Int
)


case class Record40 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record39 (
    product_ : Record40,
    index_ : Int
)


case class Record42 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record41 (
    product_ : Record42,
    index_ : Int
)


case class Record44 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record43 (
    product_ : Record44,
    index_ : Int
)


case class Record36 (
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
    dtSegmentRef : Record37,
    cscSegmentRef : Record39,
    gemSegmentRef : Record41,
    me0SegmentRef : Record43
)


case class Record47 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record46 (
    product_ : Record47,
    index_ : Int
)


case class Record49 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record48 (
    product_ : Record49,
    index_ : Int
)


case class Record51 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record50 (
    product_ : Record51,
    index_ : Int
)


case class Record53 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record52 (
    product_ : Record53,
    index_ : Int
)


case class Record45 (
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
    dtSegmentRef : Record46,
    cscSegmentRef : Record48,
    gemSegmentRef : Record50,
    me0SegmentRef : Record52
)


case class Record56 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record55 (
    product_ : Record56,
    index_ : Int
)


case class Record58 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record57 (
    product_ : Record58,
    index_ : Int
)


case class Record60 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record59 (
    product_ : Record60,
    index_ : Int
)


case class Record62 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record61 (
    product_ : Record62,
    index_ : Int
)


case class Record54 (
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
    dtSegmentRef : Record55,
    cscSegmentRef : Record57,
    gemSegmentRef : Record59,
    me0SegmentRef : Record61
)


case class Record63 (
    x : Float,
    mask : Int,
    bx : Int
)


case class Record64 (
    id_ : Int
)


case class Record26 (
    segmentMatches : Seq[Record27],
    gemMatches : Seq[Record36],
    me0Matches : Seq[Record45],
    truthMatches : Seq[Record54],
    rpcMatches : Seq[Record63],
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
    id : Record64
)


case class Record65 (
    nDof : Int,
    timeAtIpInOut : Float,
    timeAtIpInOutErr : Float,
    timeAtIpOutIn : Float,
    timeAtIpOutInErr : Float
)


case class Record66 (
    nDof : Int,
    timeAtIpInOut : Float,
    timeAtIpInOutErr : Float,
    timeAtIpOutIn : Float,
    timeAtIpOutInErr : Float
)


case class Record67 (
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
    sumChargedHadronPt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
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


case class Record76 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record75 (
    fCoordinates : Record76
)


case class Record78 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record77 (
    patMuons_slimmedMuons__RECO_obj_refToOrig__core_ : Record78,
    key_ : Long
)


case class Record81 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record80 (
    core_ : Record81,
    indicies_ : Seq[Long]
)


case class Record79 (
    edm__PtrVectorBase : Record80
)


case class Record83 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record82 (
    core_ : Record83,
    key_ : Long
)


case class Record84 (
    first : Int,
    second : Int
)


case class Record85 (
    chiso_ : Float,
    nhiso_ : Float,
    phiso_ : Float,
    puiso_ : Float
)


case class Record88 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record90 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record89 (
    fCoordinates : Record90
)


case class Record92 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record91 (
    fCoordinates : Record92
)


case class Record87 (
    hitPattern_ : Record88,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record89,
    momentum_ : Record91,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record94 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record93 (
    product_ : Record94
)


case class Record86 (
    reco__TrackBase : Record87,
    extra_ : Record93
)


case class Record97 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record99 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record98 (
    fCoordinates : Record99
)


case class Record101 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record100 (
    fCoordinates : Record101
)


case class Record96 (
    hitPattern_ : Record97,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record98,
    momentum_ : Record100,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record103 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record102 (
    product_ : Record103
)


case class Record95 (
    reco__TrackBase : Record96,
    extra_ : Record102
)


case class Record106 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record108 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record107 (
    fCoordinates : Record108
)


case class Record110 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record109 (
    fCoordinates : Record110
)


case class Record105 (
    hitPattern_ : Record106,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record107,
    momentum_ : Record109,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record112 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record111 (
    product_ : Record112
)


case class Record104 (
    reco__TrackBase : Record105,
    extra_ : Record111
)


case class Record115 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record117 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record116 (
    fCoordinates : Record117
)


case class Record119 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record118 (
    fCoordinates : Record119
)


case class Record114 (
    hitPattern_ : Record115,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record116,
    momentum_ : Record118,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record121 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record120 (
    product_ : Record121
)


case class Record113 (
    reco__TrackBase : Record114,
    extra_ : Record120
)


case class Record124 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record126 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record125 (
    fCoordinates : Record126
)


case class Record128 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record127 (
    fCoordinates : Record128
)


case class Record123 (
    hitPattern_ : Record124,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record125,
    momentum_ : Record127,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record130 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record129 (
    product_ : Record130
)


case class Record122 (
    reco__TrackBase : Record123,
    extra_ : Record129
)


case class Record131 (
    type_ : Int,
    corrX_ : Float,
    corrY_ : Float
)


case class Record132 (
    type_ : Int,
    corrX_ : Float,
    corrY_ : Float
)


case class Record135 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record137 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record136 (
    fCoordinates : Record137
)


case class Record139 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record138 (
    fCoordinates : Record139
)


case class Record134 (
    hitPattern_ : Record135,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record136,
    momentum_ : Record138,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record141 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record140 (
    product_ : Record141
)


case class Record133 (
    reco__TrackBase : Record134,
    extra_ : Record140
)


case class Record144 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record146 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record145 (
    fCoordinates : Record146
)


case class Record148 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record147 (
    fCoordinates : Record148
)


case class Record143 (
    hitPattern_ : Record144,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record145,
    momentum_ : Record147,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record150 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record149 (
    product_ : Record150
)


case class Record142 (
    reco__TrackBase : Record143,
    extra_ : Record149
)


case class Record153 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record155 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record154 (
    fCoordinates : Record155
)


case class Record157 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record156 (
    fCoordinates : Record157
)


case class Record152 (
    hitPattern_ : Record153,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record154,
    momentum_ : Record156,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record159 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record158 (
    product_ : Record159
)


case class Record151 (
    reco__TrackBase : Record152,
    extra_ : Record158
)


case class Record161 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record160 (
    patMuons_slimmedMuons__RECO_obj_pfCandidateRef__product_ : Record161
)


case class Record0 (
    m_state : Record1,
    innerTrack_ : Record6,
    outerTrack_ : Record8,
    globalTrack_ : Record10,
    patMuons_slimmedMuons__RECO_obj_refittedTrackMap_ : Map[Int, Record12],
    bestTrackType_ : Int,
    bestTunePTrackType_ : Int,
    calEnergy_ : Record14,
    combinedQuality_ : Record21,
    patMuons_slimmedMuons__RECO_obj_muMatches_ : Seq[Record26],
    time_ : Record65,
    rpcTime_ : Record66,
    energyValid_ : Boolean,
    matchesValid_ : Boolean,
    isolationValid_ : Boolean,
    pfIsolationValid_ : Boolean,
    qualityValid_ : Boolean,
    caloCompatibility_ : Float,
    isolationR03_ : Record67,
    isolationR05_ : Record68,
    pfIsolationR03_ : Record69,
    pfIsoMeanDRR03_ : Record70,
    pfIsoSumDRR03_ : Record71,
    pfIsolationR04_ : Record72,
    pfIsoMeanDRR04_ : Record73,
    pfIsoSumDRR04_ : Record74,
    type_ : Int,
    pfP4_ : Record75,
    refToOrig_ : Record77,
    patMuons_slimmedMuons__RECO_obj_efficiencyNames_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_overlapLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_overlapItems_ : Seq[Record79],
    patMuons_slimmedMuons__RECO_obj_userDataLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userFloatLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userFloats_ : Seq[Float],
    patMuons_slimmedMuons__RECO_obj_userIntLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userInts_ : Seq[Int],
    patMuons_slimmedMuons__RECO_obj_userCandLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_userCands_ : Seq[Record82],
    patMuons_slimmedMuons__RECO_obj_kinResolutionLabels_ : Seq[String],
    patMuons_slimmedMuons__RECO_obj_isoDeposits_ : Seq[Record84],
    patMuons_slimmedMuons__RECO_obj_isolations_ : Seq[Float],
    miniPFIsolation_ : Record85,
    embeddedMuonBestTrack_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_muonBestTrack_ : Seq[Record86],
    embeddedTunePMuonBestTrack_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_tunePMuonBestTrack_ : Seq[Record95],
    embeddedTrack_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_track_ : Seq[Record104],
    embeddedStandAloneMuon_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_standAloneMuon_ : Seq[Record113],
    embeddedCombinedMuon_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_combinedMuon_ : Seq[Record122],
    embeddedTCMETMuonCorrs_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_tcMETMuonCorrs_ : Seq[Record131],
    embeddedCaloMETMuonCorrs_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_caloMETMuonCorrs_ : Seq[Record132],
    embeddedPickyMuon_ : Boolean,
    embeddedTpfmsMuon_ : Boolean,
    embeddedDytMuon_ : Boolean,
    patMuons_slimmedMuons__RECO_obj_pickyMuon_ : Seq[Record133],
    patMuons_slimmedMuons__RECO_obj_tpfmsMuon_ : Seq[Record142],
    patMuons_slimmedMuons__RECO_obj_dytMuon_ : Seq[Record151],
    embeddedPFCandidate_ : Boolean,
    pfCandidateRef_ : Record160,
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


case class Record165 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record164 (
    fCoordinates : Record165
)


case class Record167 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record166 (
    fCoordinates : Record167
)


case class Record163 (
    vertex_ : Record164,
    p4Polar_ : Record166,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record168 (
    scPixCharge : Int,
    isGsfCtfScPixConsistent : Boolean,
    isGsfScPixConsistent : Boolean,
    isGsfCtfConsistent : Boolean
)


case class Record170 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record169 (
    patElectrons_slimmedElectrons__RECO_obj_core__product_ : Record170
)


case class Record173 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record172 (
    patElectrons_slimmedElectrons__RECO_obj_trackClusterMatching__electronCluster_core_ : Record173,
    key_ : Long
)


case class Record171 (
    electronCluster : Record172,
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


case class Record176 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record175 (
    fCoordinates : Record176
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


case class Record174 (
    positionAtVtx : Record175,
    positionAtCalo : Record177,
    momentumAtVtx : Record179,
    momentumAtCalo : Record181,
    momentumOut : Record183,
    momentumAtEleClus : Record185,
    momentumAtVtxWithConstraint : Record187
)


case class Record189 (
    isEB : Boolean,
    isEE : Boolean,
    isEBEEGap : Boolean,
    isEBEtaGap : Boolean,
    isEBPhiGap : Boolean,
    isEEDeeGap : Boolean,
    isEERingGap : Boolean
)


case class Record192 (
    id_ : Int
)


case class Record191 (
    DetId : Record192
)


case class Record190 (
    sigmaEtaEta : Float,
    sigmaIetaIeta : Float,
    sigmaIphiIphi : Float,
    e1x5 : Float,
    e2x5Max : Float,
    e5x5 : Float,
    r9 : Float,
    hcalDepth1OverEcal : Float,
    hcalDepth2OverEcal : Float,
    patElectrons_slimmedElectrons__RECO_obj_showerShape__hcalTowersBehindClusters : Seq[Record191],
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


case class Record195 (
    id_ : Int
)


case class Record194 (
    DetId : Record195
)


case class Record193 (
    sigmaEtaEta : Float,
    sigmaIetaIeta : Float,
    sigmaIphiIphi : Float,
    e1x5 : Float,
    e2x5Max : Float,
    e5x5 : Float,
    r9 : Float,
    hcalDepth1OverEcal : Float,
    hcalDepth2OverEcal : Float,
    patElectrons_slimmedElectrons__RECO_obj_full5x5_showerShape__hcalTowersBehindClusters : Seq[Record194],
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


case class Record196 (
    nSaturatedXtals : Int,
    isSeedSaturated : Boolean
)


case class Record197 (
    tkSumPt : Float,
    ecalRecHitSumEt : Float,
    hcalDepth1TowerSumEt : Float,
    hcalDepth2TowerSumEt : Float,
    hcalDepth1TowerSumEtBc : Float,
    hcalDepth2TowerSumEtBc : Float
)


case class Record198 (
    tkSumPt : Float,
    ecalRecHitSumEt : Float,
    hcalDepth1TowerSumEt : Float,
    hcalDepth2TowerSumEt : Float,
    hcalDepth1TowerSumEtBc : Float,
    hcalDepth2TowerSumEtBc : Float
)


case class Record199 (
    flags : Int,
    dist : Float,
    dcot : Float,
    radius : Float
)


case class Record200 (
    sumChargedHadronPt : Float,
    sumNeutralHadronEt : Float,
    sumPhotonEt : Float,
    sumChargedParticlePt : Float,
    sumNeutralHadronEtHighThreshold : Float,
    sumPhotonEtHighThreshold : Float,
    sumPUPt : Float
)


case class Record201 (
    earlyBrem : Int,
    lateBrem : Int,
    sigmaEtaEta : Float,
    hadEnergy : Float,
    deltaEta : Float,
    nClusterOutsideMustache : Int,
    etOutsideMustache : Float
)


case class Record202 (
    status : Int,
    mva_Isolated : Float,
    mva_e_pi : Float,
    mvaByPassForIsolated : Float
)


case class Record205 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record204 (
    patElectrons_slimmedElectrons__RECO_obj_ambiguousGsfTracks__refVector__product_ : Record205,
    patElectrons_slimmedElectrons__RECO_obj_ambiguousGsfTracks__refVector__keys_ : Seq[Int]
)


case class Record203 (
    refVector_ : Record204
)


case class Record206 (
    trackFbrem : Float,
    superClusterFbrem : Float
)


case class Record209 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record208 (
    fCoordinates : Record209
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


case class Record207 (
    isEcalEnergyCorrected : Boolean,
    correctedEcalEnergy : Float,
    correctedEcalEnergyError : Float,
    trackMomentumError : Float,
    fromSuperClusterP4 : Record208,
    fromSuperClusterP4Error : Float,
    combinedP4 : Record210,
    combinedP4Error : Float,
    pflowP4 : Record212,
    pflowP4Error : Float,
    candidateP4Kind : Int
)


case class Record214 (
    dPhi1 : Float,
    dPhi2 : Float,
    dRz1 : Float,
    dRz2 : Float,
    subdetectors : Byte
)


case class Record216 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record215 (
    patElectrons_slimmedElectrons__RECO_obj_refToOrig__core_ : Record216,
    key_ : Long
)


case class Record219 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record218 (
    core_ : Record219,
    indicies_ : Seq[Long]
)


case class Record217 (
    edm__PtrVectorBase : Record218
)


case class Record221 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record220 (
    core_ : Record221,
    key_ : Long
)


case class Record222 (
    first : Int,
    second : Int
)


case class Record223 (
    chiso_ : Float,
    nhiso_ : Float,
    phiso_ : Float,
    puiso_ : Float
)


case class Record226 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record225 (
    product_ : Record226
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


case class Record235 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record234 (
    product_ : Record235,
    keys_ : Seq[Int]
)


case class Record233 (
    refVector_ : Record234
)


case class Record238 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record237 (
    product_ : Record238,
    keys_ : Seq[Int]
)


case class Record236 (
    refVector_ : Record237
)


case class Record224 (
    gsfTrack_ : Record225,
    superCluster_ : Record227,
    parentSuperCluster_ : Record229,
    closestCtfTrack_ : Record231,
    conversions_ : Record233,
    conversionsOneLeg_ : Record236,
    ctfGsfOverlap_ : Float,
    isEcalDrivenSeed_ : Boolean,
    isTrackerDrivenSeed_ : Boolean
)


case class Record242 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record244 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record243 (
    fCoordinates : Record244
)


case class Record246 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record245 (
    fCoordinates : Record246
)


case class Record241 (
    hitPattern_ : Record242,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record243,
    momentum_ : Record245,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record248 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record247 (
    product_ : Record248
)


case class Record240 (
    reco__TrackBase : Record241,
    extra_ : Record247
)


case class Record250 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record249 (
    product_ : Record250
)


case class Record252 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record251 (
    fCoordinates : Record252
)


case class Record239 (
    reco__Track : Record240,
    gsfExtra_ : Record249,
    chargeMode_ : Byte,
    momentumMode_ : Record251,
    covarianceMode_ : Seq[Float]
)


case class Record256 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record255 (
    fCoordinates : Record256
)


case class Record257 (
    detectors_ : Int
)


case class Record259 (
    id_ : Int
)


case class Record258 (
    first : Record259,
    second : Float
)


case class Record260 (
    id_ : Int
)


case class Record254 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record255,
    caloID_ : Record257,
    hitsAndFractions_ : Seq[Record258],
    algoID_ : Int,
    seedId_ : Record260,
    flags_ : Int
)


case class Record262 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record261 (
    core_ : Record262,
    key_ : Long
)


case class Record265 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record264 (
    core_ : Record265,
    indicies_ : Seq[Long]
)


case class Record263 (
    edm__PtrVectorBase : Record264
)


case class Record268 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record267 (
    core_ : Record268,
    indicies_ : Seq[Long]
)


case class Record266 (
    edm__PtrVectorBase : Record267
)


case class Record253 (
    reco__CaloCluster : Record254,
    seed_ : Record261,
    clusters_ : Record263,
    preshowerClusters_ : Record266,
    preshowerEnergy_ : Double,
    rawEnergy_ : Float,
    phiWidth_ : Float,
    etaWidth_ : Float,
    preshowerEnergy1_ : Double,
    preshowerEnergy2_ : Double
)


case class Record271 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record270 (
    fCoordinates : Record271
)


case class Record272 (
    detectors_ : Int
)


case class Record274 (
    id_ : Int
)


case class Record273 (
    first : Record274,
    second : Float
)


case class Record275 (
    id_ : Int
)


case class Record269 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record270,
    caloID_ : Record272,
    hitsAndFractions_ : Seq[Record273],
    algoID_ : Int,
    seedId_ : Record275,
    flags_ : Int
)


case class Record278 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record277 (
    fCoordinates : Record278
)


case class Record279 (
    detectors_ : Int
)


case class Record281 (
    id_ : Int
)


case class Record280 (
    first : Record281,
    second : Float
)


case class Record282 (
    id_ : Int
)


case class Record276 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record277,
    caloID_ : Record279,
    hitsAndFractions_ : Seq[Record280],
    algoID_ : Int,
    seedId_ : Record282,
    flags_ : Int
)


case class Record285 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record284 (
    fCoordinates : Record285
)


case class Record286 (
    detectors_ : Int
)


case class Record288 (
    id_ : Int
)


case class Record287 (
    first : Record288,
    second : Float
)


case class Record289 (
    id_ : Int
)


case class Record283 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record284,
    caloID_ : Record286,
    hitsAndFractions_ : Seq[Record287],
    algoID_ : Int,
    seedId_ : Record289,
    flags_ : Int
)


case class Record292 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record291 (
    fCoordinates : Record292
)


case class Record293 (
    detectors_ : Int
)


case class Record295 (
    id_ : Int
)


case class Record294 (
    first : Record295,
    second : Float
)


case class Record296 (
    id_ : Int
)


case class Record290 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record291,
    caloID_ : Record293,
    hitsAndFractions_ : Seq[Record294],
    algoID_ : Int,
    seedId_ : Record296,
    flags_ : Int
)


case class Record300 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record299 (
    fCoordinates : Record300
)


case class Record301 (
    detectors_ : Int
)


case class Record303 (
    id_ : Int
)


case class Record302 (
    first : Record303,
    second : Float
)


case class Record304 (
    id_ : Int
)


case class Record298 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record299,
    caloID_ : Record301,
    hitsAndFractions_ : Seq[Record302],
    algoID_ : Int,
    seedId_ : Record304,
    flags_ : Int
)


case class Record306 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record305 (
    core_ : Record306,
    key_ : Long
)


case class Record309 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record308 (
    core_ : Record309,
    indicies_ : Seq[Long]
)


case class Record307 (
    edm__PtrVectorBase : Record308
)


case class Record312 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record311 (
    core_ : Record312,
    indicies_ : Seq[Long]
)


case class Record310 (
    edm__PtrVectorBase : Record311
)


case class Record297 (
    reco__CaloCluster : Record298,
    seed_ : Record305,
    clusters_ : Record307,
    preshowerClusters_ : Record310,
    preshowerEnergy_ : Double,
    rawEnergy_ : Float,
    phiWidth_ : Float,
    etaWidth_ : Float,
    preshowerEnergy1_ : Double,
    preshowerEnergy2_ : Double
)


case class Record315 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record317 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record316 (
    fCoordinates : Record317
)


case class Record319 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record318 (
    fCoordinates : Record319
)


case class Record314 (
    hitPattern_ : Record315,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record316,
    momentum_ : Record318,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record321 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record320 (
    product_ : Record321
)


case class Record313 (
    reco__TrackBase : Record314,
    extra_ : Record320
)


case class Record324 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record323 (
    fCoordinates : Record324
)


case class Record325 (
    detectors_ : Int
)


case class Record327 (
    id_ : Int
)


case class Record326 (
    first : Record327,
    second : Float
)


case class Record328 (
    id_ : Int
)


case class Record322 (
    energy_ : Double,
    correctedEnergy_ : Double,
    correctedEnergyUncertainty_ : Float,
    position_ : Record323,
    caloID_ : Record325,
    hitsAndFractions_ : Seq[Record326],
    algoID_ : Int,
    seedId_ : Record328,
    flags_ : Int
)


case class Record331 (
    id_ : Int
)


case class Record330 (
    id_ : Record331,
    energy_ : Float,
    time_ : Float,
    flagBits_ : Int,
    extra_ : Int
)


case class Record329 (
    patElectrons_slimmedElectrons__RECO_obj_recHits__obj : Seq[Record330]
)


case class Record332 (
    first : String,
    second : Float
)


case class Record334 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record333 (
    patElectrons_slimmedElectrons__RECO_obj_pfCandidateRef__product_ : Record334
)


case class Record336 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record335 (
    fCoordinates : Record336
)


case class Record338 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record337 (
    patElectrons_slimmedElectrons__RECO_obj_packedPFCandidates__product_ : Record338
)


case class Record162 (
    m_state : Record163,
    chargeInfo_ : Record168,
    core_ : Record169,
    trackClusterMatching_ : Record171,
    trackExtrapolations_ : Record174,
    fiducialFlags_ : Record189,
    showerShape_ : Record190,
    full5x5_showerShape_ : Record193,
    saturationInfo_ : Record196,
    dr03_ : Record197,
    dr04_ : Record198,
    conversionRejection_ : Record199,
    pfIso_ : Record200,
    mvaInput_ : Record201,
    mvaOutput_ : Record202,
    passCutBasedPreselection_ : Boolean,
    passPflowPreselection_ : Boolean,
    passMvaPreslection_ : Boolean,
    ambiguous_ : Boolean,
    ambiguousGsfTracks_ : Record203,
    classVariables_ : Record206,
    class_ : Int,
    corrections_ : Record207,
    pixelMatchVariables_ : Record214,
    refToOrig_ : Record215,
    patElectrons_slimmedElectrons__RECO_obj_efficiencyNames_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_overlapLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_overlapItems_ : Seq[Record217],
    patElectrons_slimmedElectrons__RECO_obj_userDataLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userFloatLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userFloats_ : Seq[Float],
    patElectrons_slimmedElectrons__RECO_obj_userIntLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userInts_ : Seq[Int],
    patElectrons_slimmedElectrons__RECO_obj_userCandLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_userCands_ : Seq[Record220],
    patElectrons_slimmedElectrons__RECO_obj_kinResolutionLabels_ : Seq[String],
    patElectrons_slimmedElectrons__RECO_obj_isoDeposits_ : Seq[Record222],
    patElectrons_slimmedElectrons__RECO_obj_isolations_ : Seq[Float],
    miniPFIsolation_ : Record223,
    embeddedGsfElectronCore_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_gsfElectronCore_ : Seq[Record224],
    embeddedGsfTrack_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_gsfTrack_ : Seq[Record239],
    embeddedSuperCluster_ : Boolean,
    embeddedPflowSuperCluster_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_superCluster_ : Seq[Record253],
    patElectrons_slimmedElectrons__RECO_obj_basicClusters_ : Seq[Record269],
    patElectrons_slimmedElectrons__RECO_obj_preshowerClusters_ : Seq[Record276],
    patElectrons_slimmedElectrons__RECO_obj_pflowBasicClusters_ : Seq[Record283],
    patElectrons_slimmedElectrons__RECO_obj_pflowPreshowerClusters_ : Seq[Record290],
    patElectrons_slimmedElectrons__RECO_obj_pflowSuperCluster_ : Seq[Record297],
    embeddedTrack_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_track_ : Seq[Record313],
    embeddedSeedCluster_ : Boolean,
    patElectrons_slimmedElectrons__RECO_obj_seedCluster_ : Seq[Record322],
    embeddedRecHits_ : Boolean,
    recHits_ : Record329,
    patElectrons_slimmedElectrons__RECO_obj_electronIDs_ : Seq[Record332],
    isPF_ : Boolean,
    embeddedPFCandidate_ : Boolean,
    pfCandidateRef_ : Record333,
    ecalDrivenMomentum_ : Record335,
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
    packedPFCandidates_ : Record337,
    patElectrons_slimmedElectrons__RECO_obj_associatedPackedFCandidateIndices_ : Seq[Short]
)


case class Record342 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record341 (
    fCoordinates : Record342
)


case class Record344 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record343 (
    fCoordinates : Record344
)


case class Record340 (
    vertex_ : Record341,
    p4Polar_ : Record343,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record346 (
    fX : Double,
    fY : Double,
    fZ : Double,
    fT : Double
)


case class Record345 (
    fCoordinates : Record346
)


case class Record348 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record347 (
    patTaus_slimmedTaus__RECO_obj_leadTrack__product_ : Record348
)


case class Record351 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record350 (
    patTaus_slimmedTaus__RECO_obj_signalTracks__refVector__product_ : Record351,
    patTaus_slimmedTaus__RECO_obj_signalTracks__refVector__keys_ : Seq[Int]
)


case class Record349 (
    refVector_ : Record350
)


case class Record354 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record353 (
    patTaus_slimmedTaus__RECO_obj_isolationTracks__refVector__product_ : Record354,
    patTaus_slimmedTaus__RECO_obj_isolationTracks__refVector__keys_ : Seq[Int]
)


case class Record352 (
    refVector_ : Record353
)


case class Record356 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record355 (
    patTaus_slimmedTaus__RECO_obj_refToOrig__core_ : Record356,
    key_ : Long
)


case class Record359 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record358 (
    core_ : Record359,
    indicies_ : Seq[Long]
)


case class Record357 (
    edm__PtrVectorBase : Record358
)


case class Record361 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record360 (
    core_ : Record361,
    key_ : Long
)


case class Record362 (
    first : Int,
    second : Int
)


case class Record363 (
    chiso_ : Float,
    nhiso_ : Float,
    phiso_ : Float,
    puiso_ : Float
)


case class Record366 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record368 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record367 (
    fCoordinates : Record368
)


case class Record370 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record369 (
    fCoordinates : Record370
)


case class Record365 (
    hitPattern_ : Record366,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record367,
    momentum_ : Record369,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record372 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record371 (
    product_ : Record372
)


case class Record364 (
    reco__TrackBase : Record365,
    extra_ : Record371
)


case class Record375 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record377 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record376 (
    fCoordinates : Record377
)


case class Record379 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record378 (
    fCoordinates : Record379
)


case class Record374 (
    hitPattern_ : Record375,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record376,
    momentum_ : Record378,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record381 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record380 (
    product_ : Record381
)


case class Record373 (
    reco__TrackBase : Record374,
    extra_ : Record380
)


case class Record384 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record386 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record385 (
    fCoordinates : Record386
)


case class Record388 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record387 (
    fCoordinates : Record388
)


case class Record383 (
    hitPattern_ : Record384,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record385,
    momentum_ : Record387,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record390 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record389 (
    product_ : Record390
)


case class Record382 (
    reco__TrackBase : Record383,
    extra_ : Record389
)


case class Record391 (
    first : String,
    second : Float
)


case class Record393 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record392 (
    patTaus_slimmedTaus__RECO_obj_signalChargedHadrCandPtrs__core_ : Record393,
    patTaus_slimmedTaus__RECO_obj_signalChargedHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record395 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record394 (
    patTaus_slimmedTaus__RECO_obj_signalNeutralHadrCandPtrs__core_ : Record395,
    patTaus_slimmedTaus__RECO_obj_signalNeutralHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record397 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record396 (
    patTaus_slimmedTaus__RECO_obj_signalGammaCandPtrs__core_ : Record397,
    patTaus_slimmedTaus__RECO_obj_signalGammaCandPtrs__indicies_ : Seq[Long]
)


case class Record399 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record398 (
    patTaus_slimmedTaus__RECO_obj_isolationChargedHadrCandPtrs__core_ : Record399,
    patTaus_slimmedTaus__RECO_obj_isolationChargedHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record401 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record400 (
    patTaus_slimmedTaus__RECO_obj_isolationNeutralHadrCandPtrs__core_ : Record401,
    patTaus_slimmedTaus__RECO_obj_isolationNeutralHadrCandPtrs__indicies_ : Seq[Long]
)


case class Record403 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record402 (
    patTaus_slimmedTaus__RECO_obj_isolationGammaCandPtrs__core_ : Record403,
    patTaus_slimmedTaus__RECO_obj_isolationGammaCandPtrs__indicies_ : Seq[Long]
)


case class Record406 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record405 (
    fCoordinates : Record406
)


case class Record408 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record407 (
    fCoordinates : Record408
)


case class Record410 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record409 (
    fCoordinates : Record410
)


case class Record412 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record411 (
    product_ : Record412
)


case class Record414 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record413 (
    fCoordinates : Record414
)


case class Record416 (
    fArray : Seq[Float]
)


case class Record415 (
    fRep : Record416
)


case class Record418 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record417 (
    fCoordinates : Record418
)


case class Record420 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record419 (
    product_ : Record420
)


case class Record422 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record421 (
    fCoordinates : Record422
)


case class Record424 (
    fArray : Seq[Float]
)


case class Record423 (
    fRep : Record424
)


case class Record404 (
    p4Jet_ : Record405,
    p4CorrJet_ : Record407,
    decayMode_ : Int,
    dxy_PCA_ : Record409,
    dxy_ : Float,
    dxy_error_ : Float,
    dxy_Sig_ : Float,
    pv_ : Record411,
    pvPos_ : Record413,
    pvCov_ : Record415,
    hasSV_ : Boolean,
    flightLength_ : Record417,
    flightLengthSig_ : Float,
    sv_ : Record419,
    svPos_ : Record421,
    svCov_ : Record423,
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


case class Record339 (
    m_state : Record340,
    alternatLorentzVect_ : Record345,
    leadTrack_ : Record347,
    signalTracks_ : Record349,
    isolationTracks_ : Record352,
    refToOrig_ : Record355,
    patTaus_slimmedTaus__RECO_obj_efficiencyNames_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_overlapLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_overlapItems_ : Seq[Record357],
    patTaus_slimmedTaus__RECO_obj_userDataLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userFloatLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userFloats_ : Seq[Float],
    patTaus_slimmedTaus__RECO_obj_userIntLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userInts_ : Seq[Int],
    patTaus_slimmedTaus__RECO_obj_userCandLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_userCands_ : Seq[Record360],
    patTaus_slimmedTaus__RECO_obj_kinResolutionLabels_ : Seq[String],
    patTaus_slimmedTaus__RECO_obj_isoDeposits_ : Seq[Record362],
    patTaus_slimmedTaus__RECO_obj_isolations_ : Seq[Float],
    miniPFIsolation_ : Record363,
    embeddedIsolationTracks_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_isolationTracks_ : Seq[Record364],
    embeddedLeadTrack_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_leadTrack_ : Seq[Record373],
    embeddedSignalTracks_ : Boolean,
    patTaus_slimmedTaus__RECO_obj_signalTracks_ : Seq[Record382],
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
    patTaus_slimmedTaus__RECO_obj_tauIDs_ : Seq[Record391],
    currentJECSet_ : Int,
    currentJECLevel_ : Int,
    signalChargedHadrCandPtrs_ : Record392,
    signalNeutralHadrCandPtrs_ : Record394,
    signalGammaCandPtrs_ : Record396,
    isolationChargedHadrCandPtrs_ : Record398,
    isolationNeutralHadrCandPtrs_ : Record400,
    isolationGammaCandPtrs_ : Record402,
    patTaus_slimmedTaus__RECO_obj_pfEssential_ : Seq[Record404]
)


case class Record427 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record426 (
    fCoordinates : Record427
)


case class Record430 (
    hitPattern : Seq[Short],
    hitCount : Byte,
    beginTrackHits : Byte,
    endTrackHits : Byte,
    beginInner : Byte,
    endInner : Byte,
    beginOuter : Byte,
    endOuter : Byte
)


case class Record432 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record431 (
    fCoordinates : Record432
)


case class Record434 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record433 (
    fCoordinates : Record434
)


case class Record429 (
    hitPattern_ : Record430,
    covariance_ : Seq[Float],
    chi2_ : Float,
    vertex_ : Record431,
    momentum_ : Record433,
    algoMask_ : Seq[Boolean],
    ndof_ : Float,
    charge_ : Byte,
    algorithm_ : Byte,
    originalAlgorithm_ : Byte,
    quality_ : Byte,
    nLoops_ : Byte,
    stopReason_ : Byte
)


case class Record436 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record435 (
    product_ : Record436
)


case class Record428 (
    reco__TrackBase : Record429,
    extra_ : Record435
)


case class Record425 (
    chi2_ : Float,
    ndof_ : Float,
    position_ : Record426,
    covariance_ : Seq[Float],
    recoVertexs_offlineSlimmedPrimaryVertices__RECO_obj_refittedTracks_ : Seq[Record428],
    recoVertexs_offlineSlimmedPrimaryVertices__RECO_obj_weights_ : Seq[Byte],
    validity_ : Boolean,
    time_ : Double
)


case class Record439 (
    fX : Double,
    fY : Double,
    fZ : Double
)


case class Record438 (
    fCoordinates : Record439
)


case class Record441 (
    fArray : Seq[Double]
)


case class Record440 (
    fRep : Record441
)


case class Record437 (
    position_ : Record438,
    error_ : Record440,
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


case class Record444 (
    status_ : Short
)


case class Record443 (
    paths_ : Seq[Record444]
)


case class Record445 (
    hash_ : String
)


case class Record442 (
    edm__HLTGlobalStatus : Record443,
    psetid_ : Record445,
    names_ : Seq[String]
)


case class Record449 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record448 (
    fCoordinates : Record449
)


case class Record451 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record450 (
    fCoordinates : Record451
)


case class Record447 (
    vertex_ : Record448,
    p4Polar_ : Record450,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record452 (
    hash_ : String
)


case class Record446 (
    m_state : Record447,
    collection_ : String,
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_triggerObjectTypes_ : Seq[Int],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_filterLabels_ : Seq[String],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_filterLabelIndices_ : Seq[Short],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathNames_ : Seq[String],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathIndices_ : Seq[Short],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathLastFilterAccepted_ : Seq[Boolean],
    patTriggerObjectStandAlones_selectedPatTrigger__RECO_obj_pathL3FilterAccepted_ : Seq[Boolean],
    psetId_ : Record452
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


case class Record460 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record459 (
    patMETs_slimmedMETs__RECO_obj_refToOrig__core_ : Record460,
    key_ : Long
)


case class Record463 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record462 (
    core_ : Record463,
    indicies_ : Seq[Long]
)


case class Record461 (
    edm__PtrVectorBase : Record462
)


case class Record465 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record464 (
    core_ : Record465,
    key_ : Long
)


case class Record466 (
    NeutralEMFraction : Float,
    NeutralHadFraction : Float,
    ChargedEMFraction : Float,
    ChargedHadFraction : Float,
    MuonFraction : Float,
    Type6Fraction : Float,
    Type7Fraction : Float
)


case class Record467 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record468 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record469 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record470 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record471 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record472 (
    packedDpx_ : Short,
    packedDpy_ : Short,
    packedDSumEt_ : Short
)


case class Record453 (
    m_state : Record454,
    sumet : Double,
    elongit : Double,
    signif_dxx : Double,
    signif_dyy : Double,
    signif_dyx : Double,
    signif_dxy : Double,
    refToOrig_ : Record459,
    patMETs_slimmedMETs__RECO_obj_efficiencyNames_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_overlapLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_overlapItems_ : Seq[Record461],
    patMETs_slimmedMETs__RECO_obj_userDataLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userFloatLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userFloats_ : Seq[Float],
    patMETs_slimmedMETs__RECO_obj_userIntLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userInts_ : Seq[Int],
    patMETs_slimmedMETs__RECO_obj_userCandLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_userCands_ : Seq[Record464],
    patMETs_slimmedMETs__RECO_obj_kinResolutionLabels_ : Seq[String],
    patMETs_slimmedMETs__RECO_obj_pfMET_ : Seq[Record466],
    metSig_ : Double,
    patMETs_slimmedMETs__RECO_obj_uncertaintiesRaw_ : Seq[Record467],
    patMETs_slimmedMETs__RECO_obj_uncertaintiesType1_ : Seq[Record468],
    patMETs_slimmedMETs__RECO_obj_uncertaintiesType1p2_ : Seq[Record469],
    patMETs_slimmedMETs__RECO_obj_uncertainties_ : Seq[Record470],
    patMETs_slimmedMETs__RECO_obj_corrections_ : Seq[Record471],
    caloPackedMet_ : Record472
)


case class Record476 (
    fX : Float,
    fY : Float,
    fZ : Float
)


case class Record475 (
    fCoordinates : Record476
)


case class Record478 (
    fPt : Float,
    fEta : Float,
    fPhi : Float,
    fM : Float
)


case class Record477 (
    fCoordinates : Record478
)


case class Record474 (
    vertex_ : Record475,
    p4Polar_ : Record477,
    qx3_ : Int,
    pdgId_ : Int,
    status_ : Int
)


case class Record480 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record479 (
    core_ : Record480,
    key_ : Long
)


case class Record482 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record481 (
    patJets_slimmedJets__RECO_obj_refToOrig__core_ : Record482,
    key_ : Long
)


case class Record485 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record484 (
    core_ : Record485,
    indicies_ : Seq[Long]
)


case class Record483 (
    edm__PtrVectorBase : Record484
)


case class Record487 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record486 (
    core_ : Record487,
    key_ : Long
)


case class Record489 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record488 (
    core_ : Record489,
    key_ : Long
)


case class Record492 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record491 (
    patJets_slimmedJets__RECO_obj_genJetRef__refVector__product_ : Record492,
    patJets_slimmedJets__RECO_obj_genJetRef__refVector__keys_ : Seq[Int]
)


case class Record490 (
    refVector_ : Record491
)


case class Record495 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record494 (
    patJets_slimmedJets__RECO_obj_genJetFwdRef__ref__product_ : Record495
)


case class Record497 (
    processIndex_ : Short,
    productIndex_ : Short,
    elementIndex_ : Int
)


case class Record496 (
    patJets_slimmedJets__RECO_obj_genJetFwdRef__backRef__product_ : Record497
)


case class Record493 (
    ref_ : Record494,
    backRef_ : Record496
)


case class Record501 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record500 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_bHadrons_refVector__product_ : Record501,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_bHadrons_refVector__keys_ : Seq[Int]
)


case class Record499 (
    refVector_ : Record500
)


case class Record504 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record503 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_cHadrons_refVector__product_ : Record504,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_cHadrons_refVector__keys_ : Seq[Int]
)


case class Record502 (
    refVector_ : Record503
)


case class Record507 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record506 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_partons_refVector__product_ : Record507,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_partons_refVector__keys_ : Seq[Int]
)


case class Record505 (
    refVector_ : Record506
)


case class Record510 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record509 (
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_leptons_refVector__product_ : Record510,
    patJets_slimmedJets__RECO_obj_jetFlavourInfo__m_leptons_refVector__keys_ : Seq[Int]
)


case class Record508 (
    refVector_ : Record509
)


case class Record498 (
    m_bHadrons : Record499,
    m_cHadrons : Record502,
    m_partons : Record505,
    m_leptons : Record508,
    m_hadronFlavour : Int,
    m_partonFlavour : Int
)


case class Record512 (
    first : String,
    second : Seq[Float]
)


case class Record511 (
    label_ : String,
    jec_ : Seq[Record512]
)


case class Record513 (
    first : String,
    second : Float
)


case class Record516 (
    processIndex_ : Short,
    productIndex_ : Short
)


case class Record515 (
    patJets_slimmedJets__RECO_obj_associatedTracks__refVector__product_ : Record516,
    patJets_slimmedJets__RECO_obj_associatedTracks__refVector__keys_ : Seq[Int]
)


case class Record514 (
    refVector_ : Record515
)


case class Record517 (
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


case class Record518 (
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


case class Record473 (
    m_state : Record474,
    patJets_slimmedJets__RECO_obj_dau : Seq[Record479],
    mJetArea : Float,
    mPileupEnergy : Float,
    mPassNumber : Int,
    refToOrig_ : Record481,
    patJets_slimmedJets__RECO_obj_efficiencyNames_ : Seq[String],
    patJets_slimmedJets__RECO_obj_overlapLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_overlapItems_ : Seq[Record483],
    patJets_slimmedJets__RECO_obj_userDataLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userFloatLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userFloats_ : Seq[Float],
    patJets_slimmedJets__RECO_obj_userIntLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userInts_ : Seq[Int],
    patJets_slimmedJets__RECO_obj_userCandLabels_ : Seq[String],
    patJets_slimmedJets__RECO_obj_userCands_ : Seq[Record486],
    patJets_slimmedJets__RECO_obj_kinResolutionLabels_ : Seq[String],
    embeddedCaloTowers_ : Boolean,
    embeddedPFCandidates_ : Boolean,
    patJets_slimmedJets__RECO_obj_subjetCollections_ : Seq[Seq[Record488]],
    patJets_slimmedJets__RECO_obj_subjetLabels_ : Seq[String],
    genJetRef_ : Record490,
    genJetFwdRef_ : Record493,
    jetFlavourInfo_ : Record498,
    patJets_slimmedJets__RECO_obj_jec_ : Seq[Record511],
    currentJECSet_ : Int,
    currentJECLevel_ : Int,
    currentJECFlavor_ : Int,
    patJets_slimmedJets__RECO_obj_pairDiscriVector_ : Seq[Record513],
    patJets_slimmedJets__RECO_obj_tagInfoLabels_ : Seq[String],
    jetCharge_ : Float,
    associatedTracks_ : Record514,
    patJets_slimmedJets__RECO_obj_specificPF_ : Seq[Record517],
    jetID_ : Record518
)


case class Event (
    cmsMuons : Seq[Record0],
    cmsElectrons : Seq[Record162],
    cmsTaus : Seq[Record339],
    cmsVertices : Seq[Record425],
    cmsBS : Record437,
    cmsTriggerResults : Record442,
    cmsTriggerObjects : Seq[Record446],
    cmsMET : Seq[Record453],
    cmsJets : Seq[Record473]
)

case class EventWithMuonPairs (
    muonPairs: Seq[(Record0, Record0)],
    cmsElectrons : Seq[Record162],
    cmsTaus : Seq[Record339],
    cmsVertices : Seq[Record425],
    cmsBS : Record437,
    cmsTriggerResults : Record442,
    cmsTriggerObjects : Seq[Record446],
    cmsMET : Seq[Record453],
    cmsJets : Seq[Record473]
)
