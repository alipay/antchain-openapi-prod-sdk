<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CallbackArbitrationSignstatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 案件号
    /**
     * @var string
     */
    public $caseNo;

    // 签署文件代码 01 申请书 04 撤案申请书
    /**
     * @var string
     */
    public $docCode;

    // 处理结果码 10000成功 其余都是签署失败
    /**
     * @var string
     */
    public $resCode;

    // 失败原因
    /**
     * @var string
     */
    public $message;

    // 发送时间 yyyy-MM-dd
    /**
     * @var string
     */
    public $sendTime;

    // 签名,采用公钥验签
    /**
     * @var string
     */
    public $signature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'caseNo'            => 'case_no',
        'docCode'           => 'doc_code',
        'resCode'           => 'res_code',
        'message'           => 'message',
        'sendTime'          => 'send_time',
        'signature'         => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('caseNo', $this->caseNo, true);
        Model::validateRequired('docCode', $this->docCode, true);
        Model::validateRequired('resCode', $this->resCode, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('sendTime', $this->sendTime, true);
        Model::validateRequired('signature', $this->signature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->caseNo) {
            $res['case_no'] = $this->caseNo;
        }
        if (null !== $this->docCode) {
            $res['doc_code'] = $this->docCode;
        }
        if (null !== $this->resCode) {
            $res['res_code'] = $this->resCode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackArbitrationSignstatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['case_no'])) {
            $model->caseNo = $map['case_no'];
        }
        if (isset($map['doc_code'])) {
            $model->docCode = $map['doc_code'];
        }
        if (isset($map['res_code'])) {
            $model->resCode = $map['res_code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
