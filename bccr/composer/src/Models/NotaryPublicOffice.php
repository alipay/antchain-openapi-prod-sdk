<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryPublicOffice extends Model
{
    // 公证处code
    /**
     * @example LUJIANG
     *
     * @var string
     */
    public $code;

    // 公证处名称
    /**
     * @example 鹭江公证处
     *
     * @var string
     */
    public $name;

    // 公证处所在省（直辖市）
    /**
     * @example 福建
     *
     * @var string
     */
    public $province;

    // 公证处所在市
    /**
     * @example 厦门
     *
     * @var string
     */
    public $city;

    // 公证处完整名称
    /**
     * @example 厦门市鹭江公证处
     *
     * @var string
     */
    public $orgName;
    protected $_name = [
        'code'     => 'code',
        'name'     => 'name',
        'province' => 'province',
        'city'     => 'city',
        'orgName'  => 'org_name',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('orgName', $this->orgName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryPublicOffice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }

        return $model;
    }
}
