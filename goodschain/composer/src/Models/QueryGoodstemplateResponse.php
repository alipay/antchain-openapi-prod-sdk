<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryGoodstemplateResponse extends Model
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

    // 商品模板列表
    /**
     * @var GoodsTemplateDTO[]
     */
    public $goodstemplateList;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;

    // 当前页数
    /**
     * @var int
     */
    public $currentPage;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'goodstemplateList' => 'goodstemplate_list',
        'totalPage'         => 'total_page',
        'currentPage'       => 'current_page',
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
        if (null !== $this->goodstemplateList) {
            $res['goodstemplate_list'] = [];
            if (null !== $this->goodstemplateList && \is_array($this->goodstemplateList)) {
                $n = 0;
                foreach ($this->goodstemplateList as $item) {
                    $res['goodstemplate_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGoodstemplateResponse
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
        if (isset($map['goodstemplate_list'])) {
            if (!empty($map['goodstemplate_list'])) {
                $model->goodstemplateList = [];
                $n                        = 0;
                foreach ($map['goodstemplate_list'] as $item) {
                    $model->goodstemplateList[$n++] = null !== $item ? GoodsTemplateDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }

        return $model;
    }
}
