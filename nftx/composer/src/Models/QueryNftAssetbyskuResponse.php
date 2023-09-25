<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryNftAssetbyskuResponse extends Model
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

    // 用户资产列表信息
    /**
     * @var UserAsset[]
     */
    public $assetList;

    // 支付宝账户id，特殊场景返回
    /**
     * @var string
     */
    public $alipayUid;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'assetList'  => 'asset_list',
        'alipayUid'  => 'alipay_uid',
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
        if (null !== $this->assetList) {
            $res['asset_list'] = [];
            if (null !== $this->assetList && \is_array($this->assetList)) {
                $n = 0;
                foreach ($this->assetList as $item) {
                    $res['asset_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNftAssetbyskuResponse
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
        if (isset($map['asset_list'])) {
            if (!empty($map['asset_list'])) {
                $model->assetList = [];
                $n                = 0;
                foreach ($map['asset_list'] as $item) {
                    $model->assetList[$n++] = null !== $item ? UserAsset::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }

        return $model;
    }
}
