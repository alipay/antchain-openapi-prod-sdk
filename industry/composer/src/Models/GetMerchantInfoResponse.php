<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class GetMerchantInfoResponse extends Model
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

    // source, 由中台为业务方分配, 标识业务来源
    /**
     * @var string
     */
    public $source;

    // 商户支付宝uid
    /**
     * @var string
     */
    public $merchantUserId;

    // 行业商户租户名称
    /**
     * @var string
     */
    public $merchantTenantName;

    // 二级商户id, smid, 进件成功才有
    /**
     * @var string
     */
    public $smid;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'source'             => 'source',
        'merchantUserId'     => 'merchant_user_id',
        'merchantTenantName' => 'merchant_tenant_name',
        'smid'               => 'smid',
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->merchantTenantName) {
            $res['merchant_tenant_name'] = $this->merchantTenantName;
        }
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMerchantInfoResponse
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['merchant_tenant_name'])) {
            $model->merchantTenantName = $map['merchant_tenant_name'];
        }
        if (isset($map['smid'])) {
            $model->smid = $map['smid'];
        }

        return $model;
    }
}
