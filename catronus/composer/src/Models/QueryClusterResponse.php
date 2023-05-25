<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryClusterResponse extends Model
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

    // 总数
    /**
     * @var int
     */
    public $totalCnt;

    // 集群信息
    /**
     * @var Cluster[]
     */
    public $clusters;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'totalCnt'   => 'total_cnt',
        'clusters'   => 'clusters',
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
        if (null !== $this->totalCnt) {
            $res['total_cnt'] = $this->totalCnt;
        }
        if (null !== $this->clusters) {
            $res['clusters'] = [];
            if (null !== $this->clusters && \is_array($this->clusters)) {
                $n = 0;
                foreach ($this->clusters as $item) {
                    $res['clusters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryClusterResponse
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
        if (isset($map['total_cnt'])) {
            $model->totalCnt = $map['total_cnt'];
        }
        if (isset($map['clusters'])) {
            if (!empty($map['clusters'])) {
                $model->clusters = [];
                $n               = 0;
                foreach ($map['clusters'] as $item) {
                    $model->clusters[$n++] = null !== $item ? Cluster::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
