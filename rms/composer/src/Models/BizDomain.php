<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BizDomain extends Model
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

    // tenant_id
    //
    /**
     * @example  tenant_id
     *
     * @var int
     */
    public $tenantId;

    // config
    /**
     * @example config
     *
     * @var string
     */
    public $config;

    // outside_domain_id
    /**
     * @example outside_domain_id
     *
     * @var string
     */
    public $outsideDomainId;

    // entity_list
    /**
     * @example entity_list
     *
     * @var string
     */
    public $entityList;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'tenantId'        => 'tenant_id',
        'config'          => 'config',
        'outsideDomainId' => 'outside_domain_id',
        'entityList'      => 'entity_list',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('outsideDomainId', $this->outsideDomainId, true);
        Model::validateRequired('entityList', $this->entityList, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->outsideDomainId) {
            $res['outside_domain_id'] = $this->outsideDomainId;
        }
        if (null !== $this->entityList) {
            $res['entity_list'] = $this->entityList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizDomain
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['outside_domain_id'])) {
            $model->outsideDomainId = $map['outside_domain_id'];
        }
        if (isset($map['entity_list'])) {
            $model->entityList = $map['entity_list'];
        }

        return $model;
    }
}
