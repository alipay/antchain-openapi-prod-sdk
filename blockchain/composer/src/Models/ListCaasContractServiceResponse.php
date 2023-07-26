<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListCaasContractServiceResponse extends Model
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

    // 响应版本号
    /**
     * @var string
     */
    public $version;

    // 请求是否成功
    /**
     * @var bool
     */
    public $success;

    // 异常码
    /**
     * @var string
     */
    public $errorCode;

    // 异常信息
    /**
     * @var string
     */
    public $errorMsg;

    // 请求结果数据
    /**
     * @var ContractTypeResp[]
     */
    public $data;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'version'    => 'version',
        'success'    => 'success',
        'errorCode'  => 'error_code',
        'errorMsg'   => 'error_msg',
        'data'       => 'data',
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
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCaasContractServiceResponse
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
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? ContractTypeResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
