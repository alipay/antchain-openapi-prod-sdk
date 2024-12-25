<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class SubmitAsoClickRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // App ID
    /**
     * @var string
     */
    public $appid;

    // 苹果设备的 IDFA
    /**
     * @var string
     */
    public $idfa;

    // 用户终端的公网IP地址
    /**
     * @var string
     */
    public $ip;

    // 用户代理(User Agent)
    /**
     * @var string
     */
    public $ua;

    // 渠道标识(默认 qimai )
    /**
     * @var string
     */
    public $source;

    // urlencode后的回调地址
    /**
     * @var string
     */
    public $callback;

    // 手机型号 iphone10,3
    /**
     * @var string
     */
    public $model;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appid'             => 'appid',
        'idfa'              => 'idfa',
        'ip'                => 'ip',
        'ua'                => 'ua',
        'source'            => 'source',
        'callback'          => 'callback',
        'model'             => 'model',
    ];

    public function validate()
    {
        Model::validateRequired('appid', $this->appid, true);
        Model::validateRequired('idfa', $this->idfa, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('ua', $this->ua, true);
        Model::validateRequired('callback', $this->callback, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->appid) {
            $res['appid'] = $this->appid;
        }
        if (null !== $this->idfa) {
            $res['idfa'] = $this->idfa;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->ua) {
            $res['ua'] = $this->ua;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAsoClickRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['appid'])) {
            $model->appid = $map['appid'];
        }
        if (isset($map['idfa'])) {
            $model->idfa = $map['idfa'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['ua'])) {
            $model->ua = $map['ua'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }

        return $model;
    }
}
