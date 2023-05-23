<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a1f82644937c486c81a62b0e5a6b4fbe\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainSaasAbilityWithproductResponse extends Model
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

    // 能力列表
    /**
     * @var AbilityInfo[]
     */
    public $abilityInfoList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'abilityInfoList' => 'ability_info_list',
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
        if (null !== $this->abilityInfoList) {
            $res['ability_info_list'] = [];
            if (null !== $this->abilityInfoList && \is_array($this->abilityInfoList)) {
                $n = 0;
                foreach ($this->abilityInfoList as $item) {
                    $res['ability_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainSaasAbilityWithproductResponse
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
        if (isset($map['ability_info_list'])) {
            if (!empty($map['ability_info_list'])) {
                $model->abilityInfoList = [];
                $n                      = 0;
                foreach ($map['ability_info_list'] as $item) {
                    $model->abilityInfoList[$n++] = null !== $item ? AbilityInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
