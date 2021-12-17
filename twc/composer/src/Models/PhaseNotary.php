<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PhaseNotary extends Model
{
    // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
    /**
     * @example 1
     *
     * @var int
     */
    public $phaseNo;

    // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
    /**
     * @example 123123
     *
     * @var string
     */
    public $notaryContent;

    // 业务方原始数据ID，业务方确保唯一，方便与业务方进行数据核对使用
    //
    /**
     * @example xxxx
     *
     * @var string
     */
    public $originDataId;
    protected $_name = [
        'phaseNo'       => 'phase_no',
        'notaryContent' => 'notary_content',
        'originDataId'  => 'origin_data_id',
    ];

    public function validate()
    {
        Model::validateRequired('phaseNo', $this->phaseNo, true);
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('originDataId', $this->originDataId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phaseNo) {
            $res['phase_no'] = $this->phaseNo;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->originDataId) {
            $res['origin_data_id'] = $this->originDataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhaseNotary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phase_no'])) {
            $model->phaseNo = $map['phase_no'];
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['origin_data_id'])) {
            $model->originDataId = $map['origin_data_id'];
        }

        return $model;
    }
}
