<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PullAuthWebpageUrlResponse extends Model
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

    // 可用的H5的Url，并且已经携带授权宝侧相关的参数：token、bizId等.
    /**
     * @var string
     */
    public $authUrl;

    // 此请求业务方的C端用户的DID，在授权宝侧相当于C端用户给业务方做授权，因此C端用户是issuer，业务方的B类客户是目标subject。
    /**
     * @var string
     */
    public $issuerDid;

    // 此请求业务方B类客户的DID
    /**
     * @var string
     */
    public $subjectDid;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'authUrl'    => 'auth_url',
        'issuerDid'  => 'issuer_did',
        'subjectDid' => 'subject_did',
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
        if (null !== $this->authUrl) {
            $res['auth_url'] = $this->authUrl;
        }
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullAuthWebpageUrlResponse
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
        if (isset($map['auth_url'])) {
            $model->authUrl = $map['auth_url'];
        }
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }

        return $model;
    }
}
