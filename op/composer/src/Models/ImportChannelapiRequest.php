<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ImportChannelapiRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 渠道API列表
    /**
     * @var ChannelApi[]
     */
    public $apiList;
    protected $_name = [
        'authToken' => 'auth_token',
        'apiList'   => 'api_list',
    ];

    public function validate()
    {
        Model::validateRequired('apiList', $this->apiList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apiList) {
            $res['api_list'] = [];
            if (null !== $this->apiList && \is_array($this->apiList)) {
                $n = 0;
                foreach ($this->apiList as $item) {
                    $res['api_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportChannelapiRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['api_list'])) {
            if (!empty($map['api_list'])) {
                $model->apiList = [];
                $n              = 0;
                foreach ($map['api_list'] as $item) {
                    $model->apiList[$n++] = null !== $item ? ChannelApi::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
