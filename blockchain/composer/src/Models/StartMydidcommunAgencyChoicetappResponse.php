<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyChoicetappResponse extends Model
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

    // doc当前版本
    /**
     * @var int
     */
    public $preVersion;

    // 生成的tapp info
    /**
     * @var string
     */
    public $serviceEndpoint;

    // 生成的serviceId
    /**
     * @var string
     */
    public $serviceId;

    // service 类型
    /**
     * @var string
     */
    public $serviceType;

    // EXIST 该tapp和serviceid已经包含在did doc中；
    // CONFLICT 该serviceid已经存在，但信息与此次不一致；
    // VALID 正常
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'preVersion'      => 'pre_version',
        'serviceEndpoint' => 'service_endpoint',
        'serviceId'       => 'service_id',
        'serviceType'     => 'service_type',
        'desc'            => 'desc',
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
        if (null !== $this->preVersion) {
            $res['pre_version'] = $this->preVersion;
        }
        if (null !== $this->serviceEndpoint) {
            $res['service_endpoint'] = $this->serviceEndpoint;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyChoicetappResponse
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
        if (isset($map['pre_version'])) {
            $model->preVersion = $map['pre_version'];
        }
        if (isset($map['service_endpoint'])) {
            $model->serviceEndpoint = $map['service_endpoint'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
