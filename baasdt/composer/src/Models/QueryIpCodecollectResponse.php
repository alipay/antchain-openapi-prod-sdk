<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpCodecollectResponse extends Model
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

    // 正版码商品信息配置列表,包含产品名和出品方
    /**
     * @var IPCodeGoodsInfo[]
     */
    public $goodsInfoList;

    // 正版码流转信息
    /**
     * @var IPCodeFlowInfo[]
     */
    public $codeFlowList;

    // 正版码生命周期
    /**
     * @var IPCodeConfigTimeInfo
     */
    public $codeLifeCircle;

    // 区块链信息
    /**
     * @var IPCodeChainInfo
     */
    public $chainInfo;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'goodsInfoList'  => 'goods_info_list',
        'codeFlowList'   => 'code_flow_list',
        'codeLifeCircle' => 'code_life_circle',
        'chainInfo'      => 'chain_info',
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
        if (null !== $this->goodsInfoList) {
            $res['goods_info_list'] = [];
            if (null !== $this->goodsInfoList && \is_array($this->goodsInfoList)) {
                $n = 0;
                foreach ($this->goodsInfoList as $item) {
                    $res['goods_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->codeFlowList) {
            $res['code_flow_list'] = [];
            if (null !== $this->codeFlowList && \is_array($this->codeFlowList)) {
                $n = 0;
                foreach ($this->codeFlowList as $item) {
                    $res['code_flow_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->codeLifeCircle) {
            $res['code_life_circle'] = null !== $this->codeLifeCircle ? $this->codeLifeCircle->toMap() : null;
        }
        if (null !== $this->chainInfo) {
            $res['chain_info'] = null !== $this->chainInfo ? $this->chainInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpCodecollectResponse
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
        if (isset($map['goods_info_list'])) {
            if (!empty($map['goods_info_list'])) {
                $model->goodsInfoList = [];
                $n                    = 0;
                foreach ($map['goods_info_list'] as $item) {
                    $model->goodsInfoList[$n++] = null !== $item ? IPCodeGoodsInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code_flow_list'])) {
            if (!empty($map['code_flow_list'])) {
                $model->codeFlowList = [];
                $n                   = 0;
                foreach ($map['code_flow_list'] as $item) {
                    $model->codeFlowList[$n++] = null !== $item ? IPCodeFlowInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code_life_circle'])) {
            $model->codeLifeCircle = IPCodeConfigTimeInfo::fromMap($map['code_life_circle']);
        }
        if (isset($map['chain_info'])) {
            $model->chainInfo = IPCodeChainInfo::fromMap($map['chain_info']);
        }

        return $model;
    }
}
