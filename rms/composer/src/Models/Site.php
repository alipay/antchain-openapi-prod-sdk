<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Site extends Model
{
    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // display_name
    /**
     * @example display_name
     *
     * @var string
     */
    public $displayName;

    // local
    /**
     * @example local
     *
     * @var string
     */
    public $local;

    // domain
    /**
     * @example domain
     *
     * @var string
     */
    public $domain;

    // token
    /**
     * @example token
     *
     * @var string
     */
    public $token;

    // config
    /**
     * @example config
     *
     * @var string
     */
    public $config;

    // url_preffix
    /**
     * @example url_preffix
     *
     * @var string
     */
    public $urlPreffix;

    // readonly
    /**
     * @example readonly
     *
     * @var string
     */
    public $readonly;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'displayName' => 'display_name',
        'local'       => 'local',
        'domain'      => 'domain',
        'token'       => 'token',
        'config'      => 'config',
        'urlPreffix'  => 'url_preffix',
        'readonly'    => 'readonly',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('local', $this->local, true);
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('urlPreffix', $this->urlPreffix, true);
        Model::validateRequired('readonly', $this->readonly, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->local) {
            $res['local'] = $this->local;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->urlPreffix) {
            $res['url_preffix'] = $this->urlPreffix;
        }
        if (null !== $this->readonly) {
            $res['readonly'] = $this->readonly;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Site
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['local'])) {
            $model->local = $map['local'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['url_preffix'])) {
            $model->urlPreffix = $map['url_preffix'];
        }
        if (isset($map['readonly'])) {
            $model->readonly = $map['readonly'];
        }

        return $model;
    }
}
