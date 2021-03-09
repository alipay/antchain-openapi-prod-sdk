<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceZoneView extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // state
    /**
     * @example state
     *
     * @var string
     */
    public $state;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'id'          => 'id',
        'identity'    => 'identity',
        'name'        => 'name',
        'state'       => 'state',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('description', $this->description, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceZoneView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
