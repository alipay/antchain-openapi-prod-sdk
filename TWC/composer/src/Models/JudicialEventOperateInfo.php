<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class JudicialEventOperateInfo extends Model
{
    // 响应类型:
    // 司法调解
    // 延期确认: DELAY_CONFIRM
    // 回款确认: CASH_CONFIRM
    //
    /**
     * @example DELAY_CONFIRM
     *
     * @var string
     */
    public $operateType;

    // 响应内容
    // 延期确认
    // 确认-CONFIRM
    // 否认-DENY
    // 回款确认:
    // 确认-CONFIRM
    // 有异议-DISSENT
    /**
     * @example CONFIRM
     *
     * @var string
     */
    public $operateOpinion;

    // 当延期申请不同意,回款确认有异议时填写原因
    /**
     * @example 请求延期,请批准
     *
     * @var string
     */
    public $operateReason;

    // 回款记录编号,回款确认时必填
    /**
     * @example 202243243234a
     *
     * @var string
     */
    public $reqBizNo;
    protected $_name = [
        'operateType'    => 'operate_type',
        'operateOpinion' => 'operate_opinion',
        'operateReason'  => 'operate_reason',
        'reqBizNo'       => 'req_biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('operateOpinion', $this->operateOpinion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->operateOpinion) {
            $res['operate_opinion'] = $this->operateOpinion;
        }
        if (null !== $this->operateReason) {
            $res['operate_reason'] = $this->operateReason;
        }
        if (null !== $this->reqBizNo) {
            $res['req_biz_no'] = $this->reqBizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudicialEventOperateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['operate_opinion'])) {
            $model->operateOpinion = $map['operate_opinion'];
        }
        if (isset($map['operate_reason'])) {
            $model->operateReason = $map['operate_reason'];
        }
        if (isset($map['req_biz_no'])) {
            $model->reqBizNo = $map['req_biz_no'];
        }

        return $model;
    }
}
