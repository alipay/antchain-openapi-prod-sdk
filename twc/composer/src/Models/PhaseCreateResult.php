<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PhaseCreateResult extends Model
{
    // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
    /**
     * @example 1
     *
     * @var int
     */
    public $phaseNo;

    // 阶段ID，阶段存证的唯一标记
    /**
     * @example 4a605f04-ae9f-48d3-88ba-05c073ad5484
     *
     * @var string
     */
    public $phaseId;

    // 业务方原始数据ID，方便与业务方进行数据核对使用，并且如果同一个阶段多次存证，则需要根据业务方原始数据ID识别不同的阶段存证响应
    /**
     * @example xxx
     *
     * @var string
     */
    public $originDataId;
    protected $_name = [
        'phaseNo'      => 'phase_no',
        'phaseId'      => 'phase_id',
        'originDataId' => 'origin_data_id',
    ];

    public function validate()
    {
        Model::validateRequired('phaseNo', $this->phaseNo, true);
        Model::validateRequired('phaseId', $this->phaseId, true);
        Model::validateRequired('originDataId', $this->originDataId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phaseNo) {
            $res['phase_no'] = $this->phaseNo;
        }
        if (null !== $this->phaseId) {
            $res['phase_id'] = $this->phaseId;
        }
        if (null !== $this->originDataId) {
            $res['origin_data_id'] = $this->originDataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhaseCreateResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phase_no'])) {
            $model->phaseNo = $map['phase_no'];
        }
        if (isset($map['phase_id'])) {
            $model->phaseId = $map['phase_id'];
        }
        if (isset($map['origin_data_id'])) {
            $model->originDataId = $map['origin_data_id'];
        }

        return $model;
    }
}
