<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeCombineResponse extends Model
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

    // 总数据量
    /**
     * @var int
     */
    public $total;

    // 注册码信息
    /**
     * @var CodeRegisterInfo
     */
    public $registerInfo;

    // 关联信息
    /**
     * @var CodeRelationInfo[]
     */
    public $relationInfos;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'total'         => 'total',
        'registerInfo'  => 'register_info',
        'relationInfos' => 'relation_infos',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->registerInfo) {
            $res['register_info'] = null !== $this->registerInfo ? $this->registerInfo->toMap() : null;
        }
        if (null !== $this->relationInfos) {
            $res['relation_infos'] = [];
            if (null !== $this->relationInfos && \is_array($this->relationInfos)) {
                $n = 0;
                foreach ($this->relationInfos as $item) {
                    $res['relation_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeCombineResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['register_info'])) {
            $model->registerInfo = CodeRegisterInfo::fromMap($map['register_info']);
        }
        if (isset($map['relation_infos'])) {
            if (!empty($map['relation_infos'])) {
                $model->relationInfos = [];
                $n                    = 0;
                foreach ($map['relation_infos'] as $item) {
                    $model->relationInfos[$n++] = null !== $item ? CodeRelationInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
