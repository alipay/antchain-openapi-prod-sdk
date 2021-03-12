<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartVcVcrepositoryReadResponse extends Model
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

    // 密文加密16进制表示的字符串，是请求方did对应的didDoc中的公钥加密AES密钥的结果，使用标准信封加密的方式，AES密钥用于解密verifiable_claim_content的claim字段，如果此auth_access_key是空字符串，则说明verifiable_claim_content的内容是明文。
    /**
     * @var string
     */
    public $authAccessKey;

    // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义，可能为密文},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    /**
     * @var string
     */
    public $verifiableClaimContent;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'authAccessKey'          => 'auth_access_key',
        'verifiableClaimContent' => 'verifiable_claim_content',
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
        if (null !== $this->authAccessKey) {
            $res['auth_access_key'] = $this->authAccessKey;
        }
        if (null !== $this->verifiableClaimContent) {
            $res['verifiable_claim_content'] = $this->verifiableClaimContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartVcVcrepositoryReadResponse
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
        if (isset($map['auth_access_key'])) {
            $model->authAccessKey = $map['auth_access_key'];
        }
        if (isset($map['verifiable_claim_content'])) {
            $model->verifiableClaimContent = $map['verifiable_claim_content'];
        }

        return $model;
    }
}
