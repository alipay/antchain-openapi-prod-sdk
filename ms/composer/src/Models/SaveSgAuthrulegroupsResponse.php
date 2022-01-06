<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SaveSgAuthrulegroupsResponse extends Model
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

    // 一个服务接口的白名单和黑名单
    /**
     * @var AuthRuleGroup[]
     */
    public $authRuleGroups;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'authRuleGroups' => 'auth_rule_groups',
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
        if (null !== $this->authRuleGroups) {
            $res['auth_rule_groups'] = [];
            if (null !== $this->authRuleGroups && \is_array($this->authRuleGroups)) {
                $n = 0;
                foreach ($this->authRuleGroups as $item) {
                    $res['auth_rule_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveSgAuthrulegroupsResponse
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
        if (isset($map['auth_rule_groups'])) {
            if (!empty($map['auth_rule_groups'])) {
                $model->authRuleGroups = [];
                $n                     = 0;
                foreach ($map['auth_rule_groups'] as $item) {
                    $model->authRuleGroups[$n++] = null !== $item ? AuthRuleGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
