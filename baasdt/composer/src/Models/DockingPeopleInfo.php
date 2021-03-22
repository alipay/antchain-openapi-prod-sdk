<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class DockingPeopleInfo extends Model
{
    // 名字
    /**
     * @example 名字
     *
     * @var string
     */
    public $name;

    // 手机号
    /**
     * @example 13677548932
     *
     * @var string
     */
    public $mobilePhone;

    // 职位
    /**
     * @example 职位
     *
     * @var string
     */
    public $position;

    // 邮箱
    /**
     * @example 邮箱
     *
     * @var string
     */
    public $email;

    // 钉钉号
    /**
     * @example 钉钉号
     *
     * @var string
     */
    public $dingDing;

    // 座机
    /**
     * @example 0571-88888888
     *
     * @var string
     */
    public $telePhone;
    protected $_name = [
        'name'        => 'name',
        'mobilePhone' => 'mobile_phone',
        'position'    => 'position',
        'email'       => 'email',
        'dingDing'    => 'ding_ding',
        'telePhone'   => 'tele_phone',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mobilePhone', $this->mobilePhone, true);
        Model::validateRequired('position', $this->position, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobilePhone) {
            $res['mobile_phone'] = $this->mobilePhone;
        }
        if (null !== $this->position) {
            $res['position'] = $this->position;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->dingDing) {
            $res['ding_ding'] = $this->dingDing;
        }
        if (null !== $this->telePhone) {
            $res['tele_phone'] = $this->telePhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DockingPeopleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile_phone'])) {
            $model->mobilePhone = $map['mobile_phone'];
        }
        if (isset($map['position'])) {
            $model->position = $map['position'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['ding_ding'])) {
            $model->dingDing = $map['ding_ding'];
        }
        if (isset($map['tele_phone'])) {
            $model->telePhone = $map['tele_phone'];
        }

        return $model;
    }
}
