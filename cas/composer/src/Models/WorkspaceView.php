<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceView extends Model
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

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // region
    /**
     * @example region
     *
     * @var RegionView
     */
    public $region;

    // zones
    /**
     * @example
     *
     * @var WorkspaceZoneView[]
     */
    public $zones;
    protected $_name = [
        'id'       => 'id',
        'identity' => 'identity',
        'name'     => 'name',
        'status'   => 'status',
        'region'   => 'region',
        'zones'    => 'zones',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('zones', $this->zones, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->region) {
            $res['region'] = null !== $this->region ? $this->region->toMap() : null;
        }
        if (null !== $this->zones) {
            $res['zones'] = [];
            if (null !== $this->zones && \is_array($this->zones)) {
                $n = 0;
                foreach ($this->zones as $item) {
                    $res['zones'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceView
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['region'])) {
            $model->region = RegionView::fromMap($map['region']);
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = [];
                $n            = 0;
                foreach ($map['zones'] as $item) {
                    $model->zones[$n++] = null !== $item ? WorkspaceZoneView::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
