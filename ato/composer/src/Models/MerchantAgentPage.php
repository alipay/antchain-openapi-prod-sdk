<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantAgentPage extends Model
{
    // 进件id
    /**
     * @example 1231234343423423
     *
     * @var string
     */
    public $payExpandId;

    //
    // 代理企业名称
    /**
     * @example xx商户
     *
     * @var string
     */
    public $agentName;

    // 租户8位id
    /**
     * @example SADWQWAW
     *
     * @var string
     */
    public $tenantId;

    // 业务类型
    /**
     * @example 业务类型
     *
     * @var string
     */
    public $bizType;

    // 进件审核状态 枚举
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $payExpandStatus;
    protected $_name = [
        'payExpandId'     => 'pay_expand_id',
        'agentName'       => 'agent_name',
        'tenantId'        => 'tenant_id',
        'bizType'         => 'biz_type',
        'payExpandStatus' => 'pay_expand_status',
    ];

    public function validate()
    {
        Model::validateRequired('payExpandId', $this->payExpandId, true);
        Model::validateRequired('agentName', $this->agentName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('payExpandStatus', $this->payExpandStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }
        if (null !== $this->agentName) {
            $res['agent_name'] = $this->agentName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->payExpandStatus) {
            $res['pay_expand_status'] = $this->payExpandStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantAgentPage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }
        if (isset($map['agent_name'])) {
            $model->agentName = $map['agent_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['pay_expand_status'])) {
            $model->payExpandStatus = $map['pay_expand_status'];
        }

        return $model;
    }
}
