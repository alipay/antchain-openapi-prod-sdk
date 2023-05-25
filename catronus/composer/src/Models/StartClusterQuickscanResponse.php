<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class StartClusterQuickscanResponse extends Model
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

    // 集群id
    /**
     * @var string
     */
    public $clusterId;

    // 扫描id
    /**
     * @var string
     */
    public $scanId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'clusterId'  => 'cluster_id',
        'scanId'     => 'scan_id',
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
        if (null !== $this->scanId) {
            $res['scan_id'] = $this->scanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartClusterQuickscanResponse
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
        if (isset($map['scan_id'])) {
            $model->scanId = $map['scan_id'];
        }

        return $model;
    }
}
