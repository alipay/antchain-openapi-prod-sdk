<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListFlowCellgroupResponse extends Model
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

    // 单元组查询列表
    /**
     * @var FlowCellGroup[]
     */
    public $cellgroupList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'cellgroupList' => 'cellgroup_list',
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
        if (null !== $this->cellgroupList) {
            $res['cellgroup_list'] = [];
            if (null !== $this->cellgroupList && \is_array($this->cellgroupList)) {
                $n = 0;
                foreach ($this->cellgroupList as $item) {
                    $res['cellgroup_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListFlowCellgroupResponse
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
        if (isset($map['cellgroup_list'])) {
            if (!empty($map['cellgroup_list'])) {
                $model->cellgroupList = [];
                $n                    = 0;
                foreach ($map['cellgroup_list'] as $item) {
                    $model->cellgroupList[$n++] = null !== $item ? FlowCellGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
