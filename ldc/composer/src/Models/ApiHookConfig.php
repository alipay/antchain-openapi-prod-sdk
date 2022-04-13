<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ApiHookConfig extends Model
{
    // 卡点要调用的api地址
    /**
     * @example http://xxx.com/prepost-check
     *
     * @var string
     */
    public $postUrl;

    // 授权码
    /**
     * @example 1234544
     *
     * @var string
     */
    public $authKey;

    // 接口超时时间，单位ms
    /**
     * @example 3000
     *
     * @var string
     */
    public $timeout;

    // 查询异步卡点接口执行结果api
    /**
     * @example http://xxx.com/retrieve-check
     *
     * @var string
     */
    public $checkUrl;
    protected $_name = [
        'postUrl'  => 'post_url',
        'authKey'  => 'auth_key',
        'timeout'  => 'timeout',
        'checkUrl' => 'check_url',
    ];

    public function validate()
    {
        Model::validateRequired('postUrl', $this->postUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->postUrl) {
            $res['post_url'] = $this->postUrl;
        }
        if (null !== $this->authKey) {
            $res['auth_key'] = $this->authKey;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->checkUrl) {
            $res['check_url'] = $this->checkUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiHookConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['post_url'])) {
            $model->postUrl = $map['post_url'];
        }
        if (isset($map['auth_key'])) {
            $model->authKey = $map['auth_key'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['check_url'])) {
            $model->checkUrl = $map['check_url'];
        }

        return $model;
    }
}
