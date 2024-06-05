<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class DeviceCollectFail extends Model
{
    // 上链数据采集ID
    /**
     * @example 81htq898
     *
     * @var string
     */
    public $collectId;

    // 错误码
    /**
     * @example bad_param
     *
     * @var string
     */
    public $code;

    // 错误信息
    /**
     * @example 参数错误
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'collectId' => 'collect_id',
        'code'      => 'code',
        'message'   => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('collectId', $this->collectId, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->collectId) {
            $res['collect_id'] = $this->collectId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceCollectFail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['collect_id'])) {
            $model->collectId = $map['collect_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
