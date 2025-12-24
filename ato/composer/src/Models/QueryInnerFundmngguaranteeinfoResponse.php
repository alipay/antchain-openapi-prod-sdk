<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerFundmngguaranteeinfoResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 租户角色
    // ROLE_MERCHANT(0, "商户"),
    // ROLE_FINANCIER(1, "资金方"),
    // ROLE_MIX(2, "商户资金方"),
    // DATA_PROVIDER(3, "数据提供者"),
    // ROLE_GUARANTOR(4, "担保方"),;
    /**
     * @var int
     */
    public $tenantRole;

    // 担保信息
    /**
     * @var string
     */
    public $guaranteeInfo;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'tenantRole'    => 'tenant_role',
        'guaranteeInfo' => 'guarantee_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->tenantRole) {
            $res['tenant_role'] = $this->tenantRole;
        }
        if (null !== $this->guaranteeInfo) {
            $res['guarantee_info'] = $this->guaranteeInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerFundmngguaranteeinfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['tenant_role'])) {
            $model->tenantRole = $map['tenant_role'];
        }
        if (isset($map['guarantee_info'])) {
            $model->guaranteeInfo = $map['guarantee_info'];
        }

        return $model;
    }
}
