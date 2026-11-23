<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class Shot extends Model {
    protected $_name = [
        'shotNumber' => 'shot_number',
        'shotDuration' => 'shot_duration',
        'shotDetail' => 'shot_detail',
    ];
    public function validate() {
        Model::validateRequired('shotNumber', $this->shotNumber, true);
        Model::validateRequired('shotDuration', $this->shotDuration, true);
        Model::validateRequired('shotDetail', $this->shotDetail, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->shotNumber) {
            $res['shot_number'] = $this->shotNumber;
        }
        if (null !== $this->shotDuration) {
            $res['shot_duration'] = $this->shotDuration;
        }
        if (null !== $this->shotDetail) {
            $res['shot_detail'] = $this->shotDetail;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Shot
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['shot_number'])){
            $model->shotNumber = $map['shot_number'];
        }
        if(isset($map['shot_duration'])){
            $model->shotDuration = $map['shot_duration'];
        }
        if(isset($map['shot_detail'])){
            $model->shotDetail = $map['shot_detail'];
        }
        return $model;
    }
    // 分镜编号
    /**
     * @example 1
     * @var int
     */
    public $shotNumber;

    // 分镜时间
    /**
     * @example 8
     * @var int
     */
    public $shotDuration;

    // 分镜详情
    /**
     * @example 镜头1 [0-2s] 深夜后厨
     * @var string
     */
    public $shotDetail;

}
