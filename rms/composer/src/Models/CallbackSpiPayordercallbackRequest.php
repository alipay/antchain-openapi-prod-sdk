<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CallbackSpiPayordercallbackRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 南天门支付后回调请求, 见 http://help.aliyun-inc.com/internaldoc/detail/134798.html?spm=ntm.workbench-devPlatform-extendPoint.0.0.42a919afQhBhEB.
    /**
     * @var string
     */
    public $data;
    protected $_name = [
        'authToken' => 'auth_token',
        'data'      => 'data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackSpiPayordercallbackRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
