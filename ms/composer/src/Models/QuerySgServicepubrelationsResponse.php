<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgServicepubrelationsResponse extends Model
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

    // 发布服务数据
    /**
     * @var ServiceRelation[]
     */
    public $serviceRelations;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'serviceRelations' => 'service_relations',
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
        if (null !== $this->serviceRelations) {
            $res['service_relations'] = [];
            if (null !== $this->serviceRelations && \is_array($this->serviceRelations)) {
                $n = 0;
                foreach ($this->serviceRelations as $item) {
                    $res['service_relations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgServicepubrelationsResponse
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
        if (isset($map['service_relations'])) {
            if (!empty($map['service_relations'])) {
                $model->serviceRelations = [];
                $n                       = 0;
                foreach ($map['service_relations'] as $item) {
                    $model->serviceRelations[$n++] = null !== $item ? ServiceRelation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
