<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CargoTank extends Model
{
    // 箱号
    /**
     * @example box-001
     *
     * @var string
     */
    public $boxNo;

    // 铅封号
    //
    /**
     * @example s-f-x-99
     *
     * @var string
     */
    public $leadSealingNo;

    // 箱型
    /**
     * @example 长整箱
     *
     * @var string
     */
    public $boxType;

    // 重量
    /**
     * @example 15T
     *
     * @var string
     */
    public $boxWeight;
    protected $_name = [
        'boxNo'         => 'box_no',
        'leadSealingNo' => 'lead_sealing_no',
        'boxType'       => 'box_type',
        'boxWeight'     => 'box_weight',
    ];

    public function validate()
    {
        Model::validateRequired('boxNo', $this->boxNo, true);
        Model::validateRequired('leadSealingNo', $this->leadSealingNo, true);
        Model::validateRequired('boxType', $this->boxType, true);
        Model::validateRequired('boxWeight', $this->boxWeight, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->boxNo) {
            $res['box_no'] = $this->boxNo;
        }
        if (null !== $this->leadSealingNo) {
            $res['lead_sealing_no'] = $this->leadSealingNo;
        }
        if (null !== $this->boxType) {
            $res['box_type'] = $this->boxType;
        }
        if (null !== $this->boxWeight) {
            $res['box_weight'] = $this->boxWeight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CargoTank
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['box_no'])) {
            $model->boxNo = $map['box_no'];
        }
        if (isset($map['lead_sealing_no'])) {
            $model->leadSealingNo = $map['lead_sealing_no'];
        }
        if (isset($map['box_type'])) {
            $model->boxType = $map['box_type'];
        }
        if (isset($map['box_weight'])) {
            $model->boxWeight = $map['box_weight'];
        }

        return $model;
    }
}
