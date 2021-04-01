<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpTypeResponse extends Model
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

    // ip的type列表
    /**
     * @var string[]
     */
    public $type;

    // ip的受众人群
    /**
     * @var string[]
     */
    public $audienceGroup;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'type'          => 'type',
        'audienceGroup' => 'audience_group',
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpTypeResponse
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
        if (isset($map['type'])) {
            if (!empty($map['type'])) {
                $model->type = $map['type'];
            }
        }
        if (isset($map['audience_group'])) {
            if (!empty($map['audience_group'])) {
                $model->audienceGroup = $map['audience_group'];
            }
        }

        return $model;
    }
}
