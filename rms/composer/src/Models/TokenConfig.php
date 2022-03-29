<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TokenConfig extends Model
{
    // token
    /**
     * @example 11
     *
     * @var string
     */
    public $token;

    // 创建时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtModified;

    // last_editor
    /**
     * @example 1
     *
     * @var string
     */
    public $lastEditor;
    protected $_name = [
        'token'       => 'token',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'lastEditor'  => 'last_editor',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->lastEditor) {
            $res['last_editor'] = $this->lastEditor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TokenConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['last_editor'])) {
            $model->lastEditor = $map['last_editor'];
        }

        return $model;
    }
}
