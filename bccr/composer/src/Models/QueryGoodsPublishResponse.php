<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryGoodsPublishResponse extends Model
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

    // 发布id
    /**
     * @var string
     */
    public $pubilshId;

    // 发布状态
    /**
     * @var string
     */
    public $publishStatus;

    // 商品id
    /**
     * @var string
     */
    public $goodsId;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'pubilshId'     => 'pubilsh_id',
        'publishStatus' => 'publish_status',
        'goodsId'       => 'goods_id',
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
        if (null !== $this->pubilshId) {
            $res['pubilsh_id'] = $this->pubilshId;
        }
        if (null !== $this->publishStatus) {
            $res['publish_status'] = $this->publishStatus;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGoodsPublishResponse
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
        if (isset($map['pubilsh_id'])) {
            $model->pubilshId = $map['pubilsh_id'];
        }
        if (isset($map['publish_status'])) {
            $model->publishStatus = $map['publish_status'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }

        return $model;
    }
}
