<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ReclaimClusterResponse extends Model
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

    // 被解绑的集群id
    /**
     * @var string
     */
    public $clusterId;

    // 被解绑的集群名
    /**
     * @var string
     */
    public $clusterName;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'clusterId'   => 'cluster_id',
        'clusterName' => 'cluster_name',
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
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReclaimClusterResponse
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
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }

        return $model;
    }
}
