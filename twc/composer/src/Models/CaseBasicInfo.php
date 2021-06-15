<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CaseBasicInfo extends Model
{
    // 案件租户id
    /**
     * @example ORGJC1CN
     *
     * @var string
     */
    public $tenantId;

    // 案件类型:LEASE：租赁，FINANCIAL：金融，OTHER：其他
    /**
     * @example LEASE
     *
     * @var string
     */
    public $caseType;

    // 标的金额（单位元）
    /**
     * @example 123.00
     *
     * @var string
     */
    public $amount;

    // 业务来源主键
    /**
     * @example 232278957595482
     *
     * @var string
     */
    public $inputSourceId;

    // 案件进件来源
    /**
     * @example 租赁宝
     *
     * @var string
     */
    public $inputSource;

    // 根据业务来源主键对应订单号下的租赁事实报告和证据列表页面的嵌入URL
    /**
     * @example https://www.aliyun.com
     *
     * @var string
     */
    public $caseExt;
    protected $_name = [
        'tenantId'      => 'tenant_id',
        'caseType'      => 'case_type',
        'amount'        => 'amount',
        'inputSourceId' => 'input_source_id',
        'inputSource'   => 'input_source',
        'caseExt'       => 'case_ext',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('caseType', $this->caseType, true);
        Model::validateRequired('inputSourceId', $this->inputSourceId, true);
        Model::validateRequired('inputSource', $this->inputSource, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->caseType) {
            $res['case_type'] = $this->caseType;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->inputSourceId) {
            $res['input_source_id'] = $this->inputSourceId;
        }
        if (null !== $this->inputSource) {
            $res['input_source'] = $this->inputSource;
        }
        if (null !== $this->caseExt) {
            $res['case_ext'] = $this->caseExt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaseBasicInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['case_type'])) {
            $model->caseType = $map['case_type'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['input_source_id'])) {
            $model->inputSourceId = $map['input_source_id'];
        }
        if (isset($map['input_source'])) {
            $model->inputSource = $map['input_source'];
        }
        if (isset($map['case_ext'])) {
            $model->caseExt = $map['case_ext'];
        }

        return $model;
    }
}
