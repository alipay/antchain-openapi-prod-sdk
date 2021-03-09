<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class ListAccesskeyResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // AccessKey列表
    /**
     * @var AccessKey[]
     */
    public $accessKeys;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'accessKeys' => 'access_keys',
    ];

    public function validate()
    {
        Model::validateRequired('accessKeys', $this->accessKeys, true);
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
        if (null !== $this->accessKeys) {
            $res['access_keys'] = [];
            if (null !== $this->accessKeys && \is_array($this->accessKeys)) {
                $n = 0;
                foreach ($this->accessKeys as $item) {
                    $res['access_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAccesskeyResponse
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
        if (isset($map['access_keys'])) {
            if (!empty($map['access_keys'])) {
                $model->accessKeys = [];
                $n                 = 0;
                foreach ($map['access_keys'] as $item) {
                    $model->accessKeys[$n++] = null !== $item ? AccessKey::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
