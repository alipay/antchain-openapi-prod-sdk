<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLoadbalanceVcomputerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;

    // computer_ports
    /**
     * @var string[]
     */
    public $computerPorts;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // ips
    /**
     * @var string[]
     */
    public $ips;

    // ip_ports
    /**
     * @var string[]
     */
    public $ipPorts;

    // max_weight
    /**
     * @var int
     */
    public $maxWeight;

    // min_weight
    /**
     * @var int
     */
    public $minWeight;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // ports
    /**
     * @var string[]
     */
    public $ports;

    // v_computer_group_ids
    /**
     * @var string[]
     */
    public $vComputerGroupIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'computerIds'       => 'computer_ids',
        'computerPorts'     => 'computer_ports',
        'currentPage'       => 'current_page',
        'ips'               => 'ips',
        'ipPorts'           => 'ip_ports',
        'maxWeight'         => 'max_weight',
        'minWeight'         => 'min_weight',
        'pageSize'          => 'page_size',
        'ports'             => 'ports',
        'vComputerGroupIds' => 'v_computer_group_ids',
        'workspace'         => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->computerPorts) {
            $res['computer_ports'] = $this->computerPorts;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }
        if (null !== $this->ipPorts) {
            $res['ip_ports'] = $this->ipPorts;
        }
        if (null !== $this->maxWeight) {
            $res['max_weight'] = $this->maxWeight;
        }
        if (null !== $this->minWeight) {
            $res['min_weight'] = $this->minWeight;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->ports) {
            $res['ports'] = $this->ports;
        }
        if (null !== $this->vComputerGroupIds) {
            $res['v_computer_group_ids'] = $this->vComputerGroupIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLoadbalanceVcomputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }
        if (isset($map['computer_ports'])) {
            if (!empty($map['computer_ports'])) {
                $model->computerPorts = $map['computer_ports'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
        }
        if (isset($map['ip_ports'])) {
            if (!empty($map['ip_ports'])) {
                $model->ipPorts = $map['ip_ports'];
            }
        }
        if (isset($map['max_weight'])) {
            $model->maxWeight = $map['max_weight'];
        }
        if (isset($map['min_weight'])) {
            $model->minWeight = $map['min_weight'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['ports'])) {
            if (!empty($map['ports'])) {
                $model->ports = $map['ports'];
            }
        }
        if (isset($map['v_computer_group_ids'])) {
            if (!empty($map['v_computer_group_ids'])) {
                $model->vComputerGroupIds = $map['v_computer_group_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
