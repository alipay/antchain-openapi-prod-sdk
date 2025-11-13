<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerPlatformproductResponse extends Model
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

    // total_count
    /**
     * @var int
     */
    public $totalCount;

    // 商品列表对象
    /**
     * @var PlatformProductInfoResp[]
     */
    public $platformProductInfoList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'totalCount'              => 'total_count',
        'platformProductInfoList' => 'platform_product_info_list',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->platformProductInfoList) {
            $res['platform_product_info_list'] = [];
            if (null !== $this->platformProductInfoList && \is_array($this->platformProductInfoList)) {
                $n = 0;
                foreach ($this->platformProductInfoList as $item) {
                    $res['platform_product_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerPlatformproductResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['platform_product_info_list'])) {
            if (!empty($map['platform_product_info_list'])) {
                $model->platformProductInfoList = [];
                $n                              = 0;
                foreach ($map['platform_product_info_list'] as $item) {
                    $model->platformProductInfoList[$n++] = null !== $item ? PlatformProductInfoResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
