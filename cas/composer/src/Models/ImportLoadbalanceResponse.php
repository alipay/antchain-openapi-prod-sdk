<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportLoadbalanceResponse extends Model
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

    // 导入的 loadbalance 序列号
    /**
     * @var string
     */
    public $loadbalanceIdMapping;

    // paas_request_id
    /**
     * @var string
     */
    public $paasRequestId;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'loadbalanceIdMapping' => 'loadbalance_id_mapping',
        'paasRequestId'        => 'paas_request_id',
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
        if (null !== $this->loadbalanceIdMapping) {
            $res['loadbalance_id_mapping'] = $this->loadbalanceIdMapping;
        }
        if (null !== $this->paasRequestId) {
            $res['paas_request_id'] = $this->paasRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportLoadbalanceResponse
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
        if (isset($map['loadbalance_id_mapping'])) {
            $model->loadbalanceIdMapping = $map['loadbalance_id_mapping'];
        }
        if (isset($map['paas_request_id'])) {
            $model->paasRequestId = $map['paas_request_id'];
        }

        return $model;
    }
}
