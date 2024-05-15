<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryPdcpDtraceResponse extends Model
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

    // 存证数据类型名称
    /**
     * @var string
     */
    public $dataType;

    // 存证数据ID
    /**
     * @var string
     */
    public $dataId;

    // 存证数据版本列表
    /**
     * @var DataDepositInfo[]
     */
    public $versions;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'dataType'   => 'data_type',
        'dataId'     => 'data_id',
        'versions'   => 'versions',
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
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->versions) {
            $res['versions'] = [];
            if (null !== $this->versions && \is_array($this->versions)) {
                $n = 0;
                foreach ($this->versions as $item) {
                    $res['versions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdcpDtraceResponse
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
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['versions'])) {
            if (!empty($map['versions'])) {
                $model->versions = [];
                $n               = 0;
                foreach ($map['versions'] as $item) {
                    $model->versions[$n++] = null !== $item ? DataDepositInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
