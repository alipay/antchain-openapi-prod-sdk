<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d55db67c8e5a4e799ff51ac9e5bcede3\Models;

use AlibabaCloud\Tea\Model;

class ALiYunContractProjectDuplicate extends Model
{
    // consortium_id
    /**
     * @example consortium_id
     *
     * @var string
     */
    public $consortiumId;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // gmt_create
    /**
     * @example 21312312312
     *
     * @var int
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example 123123212
     *
     * @var int
     */
    public $gmtModified;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'consortiumId' => 'consortium_id',
        'description'  => 'description',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'id'           => 'id',
        'name'         => 'name',
        'version'      => 'version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunContractProjectDuplicate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
