<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryCyclinginsuranceServiceinventoryResponse extends Model
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

    // 商品库存列表
    /**
     * @var ItemInventoryVO[]
     */
    public $itemInventorys;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'itemInventorys' => 'item_inventorys',
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
        if (null !== $this->itemInventorys) {
            $res['item_inventorys'] = [];
            if (null !== $this->itemInventorys && \is_array($this->itemInventorys)) {
                $n = 0;
                foreach ($this->itemInventorys as $item) {
                    $res['item_inventorys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCyclinginsuranceServiceinventoryResponse
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
        if (isset($map['item_inventorys'])) {
            if (!empty($map['item_inventorys'])) {
                $model->itemInventorys = [];
                $n                     = 0;
                foreach ($map['item_inventorys'] as $item) {
                    $model->itemInventorys[$n++] = null !== $item ? ItemInventoryVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
