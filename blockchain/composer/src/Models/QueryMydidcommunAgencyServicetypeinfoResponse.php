<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryMydidcommunAgencyServicetypeinfoResponse extends Model
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

    // 对应算法的入口函数名
    /**
     * @var string
     */
    public $method;

    // 服务对应的具体的Tapp或者算法名
    /**
     * @var string
     */
    public $name;

    // 表示服务的实际处理类型，目前是Data_Tapp
    //
    /**
     * @var string
     */
    public $serviceModel;

    // 对应name的算法当前版本
    /**
     * @var int
     */
    public $version;

    // serviceType所对应版本的publickey
    /**
     * @var string
     */
    public $publicKey;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'method'       => 'method',
        'name'         => 'name',
        'serviceModel' => 'service_model',
        'version'      => 'version',
        'publicKey'    => 'public_key',
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
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->serviceModel) {
            $res['service_model'] = $this->serviceModel;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMydidcommunAgencyServicetypeinfoResponse
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
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['service_model'])) {
            $model->serviceModel = $map['service_model'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }

        return $model;
    }
}
