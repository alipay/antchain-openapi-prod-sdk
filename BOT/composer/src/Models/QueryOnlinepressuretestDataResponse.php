<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryOnlinepressuretestDataResponse extends Model
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

    // 实体上链数据列表
    /**
     * @var EntityChainData[]
     */
    public $entityChainDataList;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'entityChainDataList' => 'entity_chain_data_list',
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
        if (null !== $this->entityChainDataList) {
            $res['entity_chain_data_list'] = [];
            if (null !== $this->entityChainDataList && \is_array($this->entityChainDataList)) {
                $n = 0;
                foreach ($this->entityChainDataList as $item) {
                    $res['entity_chain_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOnlinepressuretestDataResponse
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
        if (isset($map['entity_chain_data_list'])) {
            if (!empty($map['entity_chain_data_list'])) {
                $model->entityChainDataList = [];
                $n                          = 0;
                foreach ($map['entity_chain_data_list'] as $item) {
                    $model->entityChainDataList[$n++] = null !== $item ? EntityChainData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
