<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractMerchantindirectzftResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 错误状态码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $message;

    // 额外信息，包含smid
    /**
     * @var string
     */
    public $extInfo;

    // 支付宝的ipRoleId
    /**
     * @var string[]
     */
    public $ipRoleId;

    // 申请时间
    /**
     * @var string
     */
    public $applyId;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 直付通商户进件的状态
    /**
     * @var string
     */
    public $status;

    // 支付宝返回的错误状态码
    /**
     * @var string
     */
    public $subCode;

    // 支付宝返回的错误信息描述
    /**
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'code'         => 'code',
        'message'      => 'message',
        'extInfo'      => 'ext_info',
        'ipRoleId'     => 'ip_role_id',
        'applyId'      => 'apply_id',
        'merchantName' => 'merchant_name',
        'status'       => 'status',
        'subCode'      => 'sub_code',
        'subMsg'       => 'sub_msg',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->ipRoleId) {
            $res['ip_role_id'] = $this->ipRoleId;
        }
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractMerchantindirectzftResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['ip_role_id'])) {
            if (!empty($map['ip_role_id'])) {
                $model->ipRoleId = $map['ip_role_id'];
            }
        }
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
