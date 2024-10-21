<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ApiKey extends Model
{
    // 主键
    /**
     * @example c7ac992c8c4041c3ab35c60105ed0440
     *
     * @var string
     */
    public $id;

    // AK
    /**
     * @example eyJhbGciOiJIUzI1NiJ9.eyJpbnN0aXR1dGlvblR5cGUiOiIyIiwidXNlclR5cGUiOiJJTlNUSVRVVElPTiIsInB1cnBvc2UiOiJBQ0NFU1MiLCJub25jZSI6NDIsInN1YiI6IjkiLCJpYXQiOjE3MjYyMDkyMTYsImV4cCI6MTcyNjIxNjQxM30.oF95cFuz3D_rXAcUNieJbk2uxd75O0AznIFbXiITz7A
     *
     * @var string
     */
    public $token;

    // SK(或公钥)
    /**
     * @example YU8jNHr9Qn5ROGVrFQ54JER8gkVsX05bG4PKxcdLB5eWZGIGgKSbZyeWTvHZ0fKxYFW2Je8ezk0LG3/WKOlRFGiFLVjpEYfhxffhAqj5xwk4DdBgaZEa71O0qjlAbEteQb+nJi2qK/AQJrAj3Wg==
     *
     * @var string
     */
    public $secret;

    // 创建日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreated;
    protected $_name = [
        'id'         => 'id',
        'token'      => 'token',
        'secret'     => 'secret',
        'gmtCreated' => 'gmt_created',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('secret', $this->secret, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiKey
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['secret'])) {
            $model->secret = $map['secret'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }

        return $model;
    }
}
