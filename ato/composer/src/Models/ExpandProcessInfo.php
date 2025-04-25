<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ExpandProcessInfo extends Model
{
    // TENANT_INDIRECT_MAINCLASS(间联类目)
    // TENANT_ENDPOINT（回调地址）
    // CUSTOM_SERVICE_INFO（客服信息）
    // AGENTCUSTOMERPESONINFO（间联客诉人员）
    // MERCHANT_EXPAND（商户进件）
    /**
     * @example TENANT_INDIRECT_MAINCLASS
     *
     * @var string
     */
    public $processNode;

    // 是否已提交
    /**
     * @example 是否已提交
     *
     * @var bool
     */
    public $isSubmitted;

    // 审核通过
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $auditStatus;
    protected $_name = [
        'processNode' => 'process_node',
        'isSubmitted' => 'is_submitted',
        'auditStatus' => 'audit_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->processNode) {
            $res['process_node'] = $this->processNode;
        }
        if (null !== $this->isSubmitted) {
            $res['is_submitted'] = $this->isSubmitted;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpandProcessInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['process_node'])) {
            $model->processNode = $map['process_node'];
        }
        if (isset($map['is_submitted'])) {
            $model->isSubmitted = $map['is_submitted'];
        }
        if (isset($map['audit_status'])) {
            $model->auditStatus = $map['audit_status'];
        }

        return $model;
    }
}
