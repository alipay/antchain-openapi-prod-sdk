<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class AccessKey extends Model
{
    // AK
    /**
     * @example  "accessKey":"BunwIedxgYlkplEFin"
     *
     * @var string
     */
    public $accesskey;

    // 实体创建者
    /**
     * @example "creator":"nanfeng.cm@alibaba-inc.com"
     *
     * @var string
     */
    public $creator;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtcreate;

    // 实体Id
    /**
     * @example "id":655
     *
     * @var int
     */
    public $id;

    // 实例Id
    /**
     * @example  "instanceId":"000001"
     *
     * @var string
     */
    public $instanceid;

    // 是否加密
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isencrypted;

    // 实体名称
    /**
     * @example name="test_jmc"
     *
     * @var string
     */
    public $name;

    // SK
    /**
     * @example  "secretKey":"y8GmXl0vv1q4ZoHdlVz8gDuwnedeDR7U"
     *
     * @var string
     */
    public $secretkey;
    protected $_name = [
        'accesskey'   => 'accesskey',
        'creator'     => 'creator',
        'gmtcreate'   => 'gmtcreate',
        'id'          => 'id',
        'instanceid'  => 'instanceid',
        'isencrypted' => 'isencrypted',
        'name'        => 'name',
        'secretkey'   => 'secretkey',
    ];

    public function validate()
    {
        Model::validateRequired('accesskey', $this->accesskey, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('gmtcreate', $this->gmtcreate, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceid', $this->instanceid, true);
        Model::validateRequired('isencrypted', $this->isencrypted, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('secretkey', $this->secretkey, true);
        Model::validatePattern('gmtcreate', $this->gmtcreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accesskey) {
            $res['accesskey'] = $this->accesskey;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->gmtcreate) {
            $res['gmtcreate'] = $this->gmtcreate;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceid) {
            $res['instanceid'] = $this->instanceid;
        }
        if (null !== $this->isencrypted) {
            $res['isencrypted'] = $this->isencrypted;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->secretkey) {
            $res['secretkey'] = $this->secretkey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccessKey
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['accesskey'])) {
            $model->accesskey = $map['accesskey'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['gmtcreate'])) {
            $model->gmtcreate = $map['gmtcreate'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instanceid'])) {
            $model->instanceid = $map['instanceid'];
        }
        if (isset($map['isencrypted'])) {
            $model->isencrypted = $map['isencrypted'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['secretkey'])) {
            $model->secretkey = $map['secretkey'];
        }

        return $model;
    }
}
