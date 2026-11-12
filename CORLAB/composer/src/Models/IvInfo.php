<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class IvInfo extends Model {
    protected $_name = [
        'round' => 'round',
        'featureReport' => 'feature_report',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->round) {
            $res['round'] = $this->round;
        }
        if (null !== $this->featureReport) {
            $res['feature_report'] = $this->featureReport;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IvInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['round'])){
            $model->round = $map['round'];
        }
        if(isset($map['feature_report'])){
            $model->featureReport = $map['feature_report'];
        }
        return $model;
    }
    // 轮次
    /**
     * @example 基线
     * @var string
     */
    public $round;

    // oss下载链接
    /**
     * @example https://antchain-joint-modeling-poc-sh.oss-cn-shanghai.aliyuncs.com/poc
     * @var string
     */
    public $featureReport;

}
