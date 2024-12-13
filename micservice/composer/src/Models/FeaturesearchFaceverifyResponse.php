<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MICSERVICE\Models;

use AlibabaCloud\Tea\Model;

class FeaturesearchFaceverifyResponse extends Model
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

    // 是否处理成功
    /**
     * @var bool
     */
    public $success;

    // 是否有风险，默认false
    /**
     * @var bool
     */
    public $hasRisk;

    // 搜索结果明细，即搜索到的最相似的N个样本信息
    /**
     * @var SearchedItem[]
     */
    public $searchDetail;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'success'      => 'success',
        'hasRisk'      => 'has_risk',
        'searchDetail' => 'search_detail',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->hasRisk) {
            $res['has_risk'] = $this->hasRisk;
        }
        if (null !== $this->searchDetail) {
            $res['search_detail'] = [];
            if (null !== $this->searchDetail && \is_array($this->searchDetail)) {
                $n = 0;
                foreach ($this->searchDetail as $item) {
                    $res['search_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FeaturesearchFaceverifyResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['has_risk'])) {
            $model->hasRisk = $map['has_risk'];
        }
        if (isset($map['search_detail'])) {
            if (!empty($map['search_detail'])) {
                $model->searchDetail = [];
                $n                   = 0;
                foreach ($map['search_detail'] as $item) {
                    $model->searchDetail[$n++] = null !== $item ? SearchedItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
